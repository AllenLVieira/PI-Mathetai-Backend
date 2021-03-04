INSERT INTO tb_tema (id, assunto)
  SELECT 1, 'Matemática'
    WHERE NOT EXISTS (SELECT 1 FROM tb_tema WHERE id = 1);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 2, 'Física'
    WHERE NOT EXISTS (SELECT 2 FROM tb_tema WHERE id = 2);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 3, 'Química'
    WHERE NOT EXISTS (SELECT 3 FROM tb_tema WHERE id = 3);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 4, 'Português'
    WHERE NOT EXISTS (SELECT 4 FROM tb_tema WHERE id = 4);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 5, 'Sociologia'
    WHERE NOT EXISTS (SELECT 5 FROM tb_tema WHERE id = 5);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 6, 'História'
    WHERE NOT EXISTS (SELECT 6 FROM tb_tema WHERE id = 6);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 7, 'Geografia'
    WHERE NOT EXISTS (SELECT 7 FROM tb_tema WHERE id = 7);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 8, 'Inglês'
    WHERE NOT EXISTS (SELECT 8 FROM tb_tema WHERE id = 8);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 9, 'Filosofia'
    WHERE NOT EXISTS (SELECT 9 FROM tb_tema WHERE id = 9);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 10, 'Literatura'
    WHERE NOT EXISTS (SELECT 10 FROM tb_tema WHERE id = 10);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 11, 'Redação'
    WHERE NOT EXISTS (SELECT 11 FROM tb_tema WHERE id = 11);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 12, 'Biológicas'
    WHERE NOT EXISTS (SELECT 12 FROM tb_tema WHERE id = 12);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 13, 'Direito'
    WHERE NOT EXISTS (SELECT 13 FROM tb_tema WHERE id = 13);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 14, 'Finanças'
    WHERE NOT EXISTS (SELECT 14 FROM tb_tema WHERE id = 14);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 15, 'Política'
    WHERE NOT EXISTS (SELECT 15 FROM tb_tema WHERE id = 15);
    
INSERT INTO tb_tema (id, assunto)
  SELECT 16, 'Programação'
    WHERE NOT EXISTS (SELECT 16 FROM tb_tema WHERE id = 16);
    