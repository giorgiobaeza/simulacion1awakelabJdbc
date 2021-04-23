SELECT d.rutdoctor, d.nombre, d.apellido, COUNT(a.idagenda) AS cantidadagenda
FROM doctores d
LEFT JOIN agendas a ON d.iddoctor = a.iddoctor
GROUP BY d.rutdoctor, d.nombre, d.apellido;
