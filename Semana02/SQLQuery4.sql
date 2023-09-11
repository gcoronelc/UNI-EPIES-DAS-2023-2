-- Separata 06

/*
Ejercicio 01
Desarrolle una sentencia SELECT para calcular el importe de la planilla 
del departamento de ventas. 
Debe incluir el sueldo y la comisión. 
Base de datos RH.
*/

-- Paso 1: Codigo del departamento de ventas

select * from rh..departamento;
go

-- Codigo: 103

-- Paso 2: Creación de la setencia SELECT

select 
	sum(sueldo) planilla_sueldo,
	sum(isnull(comision,0)) planilla_comision,
	sum(sueldo + isnull(comision,0)) planilla_total
from rh..empleado
where iddepartamento = 103;
go

/*
Ejercicio 3
Desarrolle una sentencia SELECT para encontrar el salario promedio en la empresa. 
Base de datos RH.
*/

select 
	avg(sueldo) sueldo_promedio
from rh..empleado;
go

-- ¿Como seria el salario promedio por departamento?
-- Se debe aplicar GROUP BY
-- GROUP BY: Resumenes por grupo

select 
	iddepartamento,
	avg(sueldo) sueldo_promedio
from rh..empleado
group by iddepartamento;
go

-- ¿Como agregar el nombre del departamento?
-- Se deben combinar tablas: INNER JOIN, LEFT OUTER JOIN, RIGHT OUTER JOIN, CROSS JOIN

select 
	d.iddepartamento, d.nombre departamento,
	avg(sueldo) sueldo_promedio
from rh..empleado e 
join rh..departamento d on e.iddepartamento = d.iddepartamento
group by d.iddepartamento, d.nombre;
go





