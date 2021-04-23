SELECT p.nombre, p.apellido, a.fecha, a.horadesde
FROM pacientes p
LEFT JOIN agendas a ON p.idpaciente = a.idpaciente
LEFT JOIN doctores d ON a.iddoctor = d.iddoctor
WHERE d.nombre = 'Juan' AND d.apellido = 'Manogrande'
ORDER BY a.fecha, a.horadesde;