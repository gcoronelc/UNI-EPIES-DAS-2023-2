

select * from matricula;
go


insert into matricula(idalumno,ciclo,estado,fecha)
values(4,'20231',1,getdate())
go


 SELECT @@IDENTITY AS 'Identity';
 go


 select * from detalle;
 go


 insert into detalle(idmat,idprog,activo) values(?,?,1)
 go




