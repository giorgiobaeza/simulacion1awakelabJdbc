select d.apellido, d.nombre, d.rutdoctor from doctores d
LEFT JOIN especialidades e ON e.idespecialidad = d.idespecialidad 
WHERE e.descripcion = 'Cardiología'
ORDER BY d.apellido, d.nombre;

