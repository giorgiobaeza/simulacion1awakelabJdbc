SELECT p.nombre, p.apellido, p.rutpaciente FROM pacientes p
LEFT JOIN agendas a ON p.idpaciente = a.idpaciente
LEFT JOIN doctores d ON a.iddoctor = d.iddoctor
LEFT JOIN especialidades e ON d.idespecialidad = e.idespecialidad
WHERE e.descripcion = 'Neurología'
ORDER BY p.rutpaciente;