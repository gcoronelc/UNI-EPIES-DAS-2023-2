/*
Se necesita encontrar la cantidad de matricualados
por curso, el importe proyectado a cobrar,
el importe cobrado y el importe que falta cobrar.
Base de datos: EDUCA o EDUCA2

CUR_ID CUR_NOMBRE  MATRICULADOS  PROYECTADO  COBRADO     FALTA
--------------------------------------------------------------------
1      XXXXXX          5          5,000.00    3,500.00   1,500.00

*/


-- Paso 1: Matriculados y proyectados

select cur_id, count(1) matriculados, sum(mat_precio) proyectado
from EDUCA2..MATRICULA
group by cur_id;
go

-- Paso 2: Cobrado

select cur_id, sum(pag_importe) cobrado
from EDUCA2..PAGO
group by cur_id;
go

-- Combinando las consultas anteriores

WITH
V1 AS (
	select cur_id, count(1) matriculados, sum(mat_precio) proyectado
	from EDUCA2..MATRICULA
	group by cur_id
),
V2 AS (
	select cur_id, sum(pag_importe) cobrado
	from EDUCA2..PAGO
	group by cur_id
)
SELECT
	C.cur_id, C.cur_nombre, 
	V1.matriculados, V1.proyectado,
	ISNULL(V2.cobrado,0) COBRADO, 
	(V1.proyectado - ISNULL(V2.cobrado,0)) Falta
FROM EDUCA2..CURSO C
JOIN V1 ON C.cur_id = V1.cur_id
LEFT JOIN V2 ON V1.cur_id = V2.cur_id;
go
