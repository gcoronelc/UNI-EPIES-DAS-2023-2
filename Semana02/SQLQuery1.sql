-- SEPARATA 05
/*
Ejercicio 8
Desarrollar una sentencia SELECT para consultar los empleados del 
departamento de contabilidad. 
Base de datos RH.
*/

-- Paso 1: Averiguar el codigo de contabilidad

select * from RH..departamento;
go

-- Codigo: 101

-- Paso 2: Consultar los empleados de contabilidad

select * from RH..empleado
where iddepartamento = 101;
go

/*
Ejercicio 10
Desarrollar una sentencia SELECT para consultar los empleados 
de contabilidad cuyo sueldo e mayor a 10,000.00. 
Base de datos RH.
*/

select * from RH.dbo.empleado
where iddepartamento = 101 AND sueldo>10000.0;
go

/*
Ejercicio 15
Desarrollar una sentencia SELECT que permita averiguar que 
empleados tienen un sueldo mayor de 3,500.0 y menor de 10,000.0. 
Base de datos RH.
*/

select * from RH.dbo.empleado
where sueldo>3500.0 AND sueldo<10000.0;
go

select * from RH.dbo.empleado
where sueldo BETWEEN 3500.0 AND 10000.0;
go


/*
Ejercicio 18
Desarrollar una sentencia SELECT para consultar los empleados 
cuyos ingresos totales es menor a 8,000.00. 
Base de datos RH.
*/

select e.*, (e.sueldo + ISNULL(e.comision,0)) Total 
from RH.dbo.empleado e
where (sueldo + ISNULL(comision,0)) < 8000.0;
go

select 90+null;
go


/*
Ejercicio 19
Desarrollar una sentencia SELECT para consultar los empleados 
que ingresaron a la empresa un mes de enero. 
Base de datos RH.
*/

select e.* from RH.dbo.empleado e
where MONTH(fecingreso) = 1;
go

select e.* from RH.dbo.empleado e
where DATEPART(m,fecingreso) = 1;
go


/*
Ejercicio 20
Desarrollar una sentencia SELECT para consultar las matrículas del último mes. 
Base de datos EDUCA.
*/

-- Si es el mes actual

select * from EDUCA2..MATRICULA
where MONTH(mat_fecha) = MONTH(GETDATE()) AND YEAR(mat_fecha) = YEAR(GETDATE());
go

-- Si es el mes anterior al mes actual

select * from EDUCA2..MATRICULA
where MONTH(mat_fecha) = (MONTH(dateadd(m,-1,GETDATE()))) 
AND YEAR(mat_fecha) = YEAR(dateadd(m,-1,GETDATE()));
go

select GETDATE(), dateadd(m,-1,GETDATE());
GO

-- Si el mes es el ultimo mes que se registro una matricula.

select MAX(mat_fecha) from educa2..MATRICULA;
go

select * from EDUCA2..MATRICULA
where MONTH(mat_fecha) = MONTH((select MAX(mat_fecha) from educa2..MATRICULA))
AND YEAR(mat_fecha) = YEAR((select MAX(mat_fecha) from educa2..MATRICULA));
go

/*
Este SELECT: select MAX(mat_fecha) fecha from educa2..MATRICULA
arroja una sola fila con una sola columna.
*/
select m.* 
from EDUCA2..MATRICULA m
cross join (select MAX(mat_fecha) fecha from educa2..MATRICULA) t
where MONTH(mat_fecha) = MONTH(t.fecha)
AND YEAR(mat_fecha) = YEAR(t.fecha);
go


