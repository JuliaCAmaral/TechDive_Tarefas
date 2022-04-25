INSERT INTO public.turma (id_turma, datainicio, datatermino, nome) VALUES (50001, now(), now(), 'DevinHouse'), (50002, now(), now(), 'TechDive'), (50003, now(), now(), '7 Ferramentas da Qualidade'), (50004, now(), now(), 'Cultura Lean'), (50005, now(), now(), 'Design Thinking para a Indústria'), (50006, now(), now(), 'Scrum para Indústria'), (50007, now(), now(), 'Ferramentas Google'), (50008, now(), now(), 'Gestão da Manutenção'), (50009, now(), now(), 'Vendas de Alta Performance'), (50010, now(), now(), 'Planejamento e Controle da Produção');
INSERT INTO public.endereco (id_endereco, bairro, cidade, estado, numero, pais, rua) VALUES (5001, 'Saco Grande', 'Florianópolis', 'SC', '3730', 'Brasil', 'Rodovia, SC-401'), (5002, 'Jardim Eldorado', 'Palhoça', 'SC', '18', 'Brasil', 'R. Joacir dos Passos'), (5003, 'Victor Konder', 'Blumenau', 'SC', '1147 Bloco Faculdade', 'Brasil', 'São Paulo');
INSERT INTO public.escola (id_escola, datadecriacao, nome, endereco_id_endereco) VALUES (501, now(), 'SENAI/SC - Florianópolis', 5001), (502, now(), 'SENAI/SC - Palhoça', 5002), (503, now(), 'SENAI/SC - Blumenau', 5003);