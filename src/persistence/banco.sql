	create database card;
	
	
	use card;
	
	create table recarga (
	
		idrecarga integer auto_increment primary key,
		codcartao integer (10) not null,
		datarecarga date not null,
		status varchar (10) not null
	
	);

insert into recarga (idrecarga, codcartao, datarecarga, status) values

  (null,'10203040',05/01/2018,'ativa'),
  (null,'10212344',05/01/2018,'ativa'),
  (null,'10233320',05/01/2018,'pendente'),
  (null,'10222220',06/01/2018,'pendete'),
  (null,'32343040',06/01/2018,'cancelada'),
  (null,'34533040',06/01/2018,'ativa'),
  (null,'14566040',07/01/2018,'cancelada'),
  (null,'10655640',07/01/2018,'ativa'),
  (null,'65433040',07/01/2018,'pendente');

