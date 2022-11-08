
SELECT
    CASE
        WHEN n.nota< 8 then 'NULL'
        ELSE a.nome
        END AS nome, n.id, a.valor
FROM alunos a
         inner JOIN notas n
                    ON  a.valor > n.valor_min AND a.valor < n.valor_max
ORDER BY CASE WHEN n.nota>= 8 THEN n.notaELSE a.valor END;