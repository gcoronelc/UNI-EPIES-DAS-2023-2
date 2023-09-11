-- COMMON TABLE EXPRESSION
-- Permite aplicar DIVIDE Y VENCERAS

/*
Ejercicio 1
Encontrar el empleado con el menor salario por departamento.
Mostrar los empates.
*/

-- Paso 1: El menor salario por departamento

WITH 
V1 AS (
	select iddepartamento, min(sueldo) sueldo_menor
	from rh..empleado
	group by iddepartamento)
select * from V1;
go


-- Paso 2: Encontrando los empleados

WITH 
V1 AS (
	select iddepartamento, min(sueldo) sueldo_menor
	from rh..empleado
	group by iddepartamento)
select e.iddepartamento, e.nombre, e.apellido, e.sueldo 
from RH..empleado e
join V1 on v1.iddepartamento=e.iddepartamento 
and V1.sueldo_menor = e.sueldo
order by 1;
go


/*
Ejercicio 2
Desarrollar una consulta para encontrar el empleado con
mas tiempo de servicio por departamento.
Mostrar los empates.
*/

-- ASTUCURI LUCAS CRISTIAN ROGER 20:08
withV1 as(	select iddepartamento, min(fecingreso) fecha_de_ingreso	from rh..empleado	group by iddepartamento)select e.iddepartamento, e.nombrefrom rh..empleado ejoin V1 on V1.iddepartamento = e.iddepartamentoand V1.fecha_de_ingreso = e.fecingresoorder by 1;go







