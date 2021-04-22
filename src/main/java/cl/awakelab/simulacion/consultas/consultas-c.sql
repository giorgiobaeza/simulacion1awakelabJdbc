select a.fecha, a.horadesde, p.nombre, p.apellido 
from (pacientes p
inner join agendas a on p.idpaciente = a.idpaciente)
where a.iddoctor = 51;