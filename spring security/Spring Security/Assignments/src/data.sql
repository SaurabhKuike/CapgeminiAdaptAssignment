INSERT INTO users(username,password,enabled)
values('vishnu','pass',true);
INSERT INTO users(username,password,enabled)
values('suraj','pass',true);
INSERT INTO authorities(username,authority)
values('vishnu','ROLE_admin');
INSERT INTO authorities(username,authority)
values('suraj','ROLE_user');
