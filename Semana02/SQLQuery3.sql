-- FUNCIONES AGREGADAS

-- Ejemplo 1

select * from rh..empleado;
go

select count(1) Empleados 
from rh..empleado;
go

select 
	count(1) Empleados,
	sum(sueldo) PlanillaSueldos
from rh..empleado;
go

select 
	count(1) Empleados,
	sum(sueldo) PlanillaSueldos,
	sum(isnull(comision,0)) PlanillaComision
from rh..empleado;
go

select 
	count(1) Empleados,
	sum(sueldo) PlanillaSueldos,
	sum(isnull(comision,0)) PlanillaComision,
	sum(sueldo + isnull(comision,0)) PlanillaTotal
from rh..empleado;
go

select 
	iddepartamento,
	count(1) Empleados,
	sum(sueldo) PlanillaSueldos,
	sum(isnull(comision,0)) PlanillaComision,
	sum(sueldo + isnull(comision,0)) PlanillaTotal
from rh..empleado
group by iddepartamento;
go

