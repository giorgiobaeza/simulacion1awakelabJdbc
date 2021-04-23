SELECT fecha, SUM(duracion) AS tiempototal FROM agendas GROUP BY fecha ORDER BY fecha DESC;
