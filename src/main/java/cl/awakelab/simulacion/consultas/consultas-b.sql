select fecha, sum(duracion) AS tempototal from agendas group by fecha order by fecha desc;
