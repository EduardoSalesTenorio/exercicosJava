Create table conta (
id int not null,
saldo decimal(10,2) not null,
status varchar(100) not null,
limite int not null,
primary key (id)
);

Create table movimentacoes (
id int not null,
datacoisa date not null,
descricao varchar(800) not null,
primary key (id),
FOREIGN KEY(id) references conta(id)
)