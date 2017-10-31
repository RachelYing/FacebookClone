/*
  Schema
  Engine: PostGreSQL
  Version: 0.0.1
  Description: Initial database structure
 */

 /*
  Structure
  */

CREATE TABLE friends (
  pairid serial NOT NULL PRIMARY KEY,
  useroneid INT NOT NULL,
  usertwoid INT NOT NULL,
  status INT NOT NULL);

CREATE TABLE membership (
  pairid serial NOT NULL PRIMARY KEY,
  groupid INT NOT NULL,
  memberid INT NOT NULL,
  status INT NOT NULL);

CREATE TABLE groups (
  groupid serial NOT NULL PRIMARY KEY,
  groupname VARCHAR(255) NOT NULL,
  groupadmin VARCHAR(255) NOT NULL);

CREATE TABLE posts (
  id serial NOT NULL PRIMARY KEY,
  authorfirst VARCHAR(255) NOT NULL,
  authorlast VARCHAR(255) NOT NULL,
  content VARCHAR(500) NOT NULL,
  likes INT NOT NULL,
  time INT NOT NULL,
  visibility INT NOT NULL);

CREATE TABLE users (
  userid serial NOT NULL PRIMARY KEY,
  firstname VARCHAR(255) NOT NULL,
  lastname VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR(255) NOT NULL,
  country VARCHAR(255) NOT NULL,
  city VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(255) NOT NULL);

CREATE TABLE role (
  role VARCHAR(255) NOT NULL,
  roleid INT NOT NULL);


CREATE TABLE loginfo (
  userid INT NOT NULL PRIMARY KEY,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  token VARCHAR(255) NOT NULL);

/*
  Data
 */

/*
  Friends relations
 */



insert into friends (useroneid, usertwoid, status) values (9, 14, 5);
insert into friends (useroneid, usertwoid, status) values (7, 4, 3);
insert into friends (useroneid, usertwoid, status) values (31, 14, 3);
insert into friends (useroneid, usertwoid, status) values (24, 15, 2);
insert into friends (useroneid, usertwoid, status) values (16, 4, 1);
insert into friends (useroneid, usertwoid, status) values (3, 5, 3);
insert into friends (useroneid, usertwoid, status) values (30, 12, 2);
insert into friends (useroneid, usertwoid, status) values (11, 12, 4);
insert into friends (useroneid, usertwoid, status) values (8, 5, 5);
insert into friends (useroneid, usertwoid, status) values (31, 2, 3);
insert into friends (useroneid, usertwoid, status) values (6, 3, 1);
insert into friends (useroneid, usertwoid, status) values (31, 22, 5);
insert into friends (useroneid, usertwoid, status) values (20, 14, 2);
insert into friends (useroneid, usertwoid, status) values (15, 6, 1);
insert into friends (useroneid, usertwoid, status) values (10, 11, 5);
insert into friends (useroneid, usertwoid, status) values (12, 3, 1);
insert into friends (useroneid, usertwoid, status) values (6, 9, 2);
insert into friends (useroneid, usertwoid, status) values (30, 10, 3);
insert into friends (useroneid, usertwoid, status) values (26, 19, 5);
insert into friends (useroneid, usertwoid, status) values (8, 10, 4);
insert into friends (useroneid, usertwoid, status) values (3, 13, 3);
insert into friends (useroneid, usertwoid, status) values (20, 7, 3);
insert into friends (useroneid, usertwoid, status) values (15, 31, 5);
insert into friends (useroneid, usertwoid, status) values (24, 1, 3);
insert into friends (useroneid, usertwoid, status) values (5, 28, 2);
insert into friends (useroneid, usertwoid, status) values (5, 10, 1);
insert into friends (useroneid, usertwoid, status) values (13, 21, 4);
insert into friends (useroneid, usertwoid, status) values (33, 14, 4);
insert into friends (useroneid, usertwoid, status) values (25, 6, 1);
insert into friends (useroneid, usertwoid, status) values (15, 32, 3);
insert into friends (useroneid, usertwoid, status) values (21, 23, 1);
insert into friends (useroneid, usertwoid, status) values (20, 23, 4);
insert into friends (useroneid, usertwoid, status) values (18, 31, 5);
insert into friends (useroneid, usertwoid, status) values (4, 32, 1);
insert into friends (useroneid, usertwoid, status) values (2, 31, 4);
insert into friends (useroneid, usertwoid, status) values (12, 4, 3);
insert into friends (useroneid, usertwoid, status) values (21, 16, 5);
insert into friends (useroneid, usertwoid, status) values (5, 33, 2);
insert into friends (useroneid, usertwoid, status) values (4, 15, 5);
insert into friends (useroneid, usertwoid, status) values (6, 2, 5);
insert into friends (useroneid, usertwoid, status) values (18, 24, 3);
insert into friends (useroneid, usertwoid, status) values (7, 31, 3);
insert into friends (useroneid, usertwoid, status) values (1, 5, 1);
insert into friends (useroneid, usertwoid, status) values (33, 11, 5);
insert into friends (useroneid, usertwoid, status) values (8, 24, 4);
insert into friends (useroneid, usertwoid, status) values (10, 20, 4);
insert into friends (useroneid, usertwoid, status) values (29, 14, 3);
insert into friends (useroneid, usertwoid, status) values (18, 2, 3);
insert into friends (useroneid, usertwoid, status) values (5, 2, 4);
insert into friends (useroneid, usertwoid, status) values (16, 18, 5);
insert into friends (useroneid, usertwoid, status) values (24, 30, 3);
insert into friends (useroneid, usertwoid, status) values (32, 33, 3);
insert into friends (useroneid, usertwoid, status) values (12, 32, 5);
insert into friends (useroneid, usertwoid, status) values (8, 23, 3);
insert into friends (useroneid, usertwoid, status) values (9, 17, 2);
insert into friends (useroneid, usertwoid, status) values (28, 29, 1);
insert into friends (useroneid, usertwoid, status) values (14, 11, 4);
insert into friends (useroneid, usertwoid, status) values (27, 19, 4);
insert into friends (useroneid, usertwoid, status) values (18, 17, 2);
insert into friends (useroneid, usertwoid, status) values (16, 15, 5);
insert into friends (useroneid, usertwoid, status) values (6, 28, 3);
insert into friends (useroneid, usertwoid, status) values (9, 31, 2);
insert into friends (useroneid, usertwoid, status) values (3, 16, 4);
insert into friends (useroneid, usertwoid, status) values (27, 19, 2);
insert into friends (useroneid, usertwoid, status) values (4, 10, 1);
insert into friends (useroneid, usertwoid, status) values (6, 8, 5);
insert into friends (useroneid, usertwoid, status) values (13, 5, 5);
insert into friends (useroneid, usertwoid, status) values (29, 3, 4);
insert into friends (useroneid, usertwoid, status) values (24, 8, 3);
insert into friends (useroneid, usertwoid, status) values (32, 22, 3);
insert into friends (useroneid, usertwoid, status) values (16, 3, 2);
insert into friends (useroneid, usertwoid, status) values (30, 3, 2);
insert into friends (useroneid, usertwoid, status) values (29, 4, 4);
insert into friends (useroneid, usertwoid, status) values (16, 12, 5);
insert into friends (useroneid, usertwoid, status) values (10, 1, 2);
insert into friends (useroneid, usertwoid, status) values (21, 26, 3);
insert into friends (useroneid, usertwoid, status) values (31, 31, 4);
insert into friends (useroneid, usertwoid, status) values (22, 7, 3);
insert into friends (useroneid, usertwoid, status) values (28, 8, 1);
insert into friends (useroneid, usertwoid, status) values (32, 29, 2);
insert into friends (useroneid, usertwoid, status) values (7, 22, 4);
insert into friends (useroneid, usertwoid, status) values (12, 26, 1);
insert into friends (useroneid, usertwoid, status) values (8, 3, 2);
insert into friends (useroneid, usertwoid, status) values (27, 11, 2);
insert into friends (useroneid, usertwoid, status) values (19, 27, 5);
insert into friends (useroneid, usertwoid, status) values (7, 32, 1);
insert into friends (useroneid, usertwoid, status) values (5, 4, 4);
insert into friends (useroneid, usertwoid, status) values (22, 28, 4);
insert into friends (useroneid, usertwoid, status) values (8, 4, 1);
insert into friends (useroneid, usertwoid, status) values (28, 24, 2);
insert into friends (useroneid, usertwoid, status) values (11, 2, 3);
insert into friends (useroneid, usertwoid, status) values (25, 27, 4);
insert into friends (useroneid, usertwoid, status) values (22, 3, 3);
insert into friends (useroneid, usertwoid, status) values (33, 3, 2);
insert into friends (useroneid, usertwoid, status) values (16, 19, 3);
insert into friends (useroneid, usertwoid, status) values (25, 32, 5);
insert into friends (useroneid, usertwoid, status) values (18, 13, 1);
insert into friends (useroneid, usertwoid, status) values (20, 31, 3);
insert into friends (useroneid, usertwoid, status) values (3, 26, 5);
insert into friends (useroneid, usertwoid, status) values (17, 31, 4);

/*
  Groups relations
 */
insert into membership (groupid, memberid, status) values (1, 30, 1);
insert into membership (groupid, memberid, status) values (7, 16, 1);
insert into membership (groupid, memberid, status) values (11, 24, 1);
insert into membership (groupid, memberid, status) values (5, 20, 1);
insert into membership (groupid, memberid, status) values (6, 29, 3);
insert into membership (groupid, memberid, status) values (5, 7, 2);
insert into membership (groupid, memberid, status) values (8, 33, 3);
insert into membership (groupid, memberid, status) values (10, 15, 3);
insert into membership (groupid, memberid, status) values (16, 24, 1);
insert into membership (groupid, memberid, status) values (20, 20, 1);
insert into membership (groupid, memberid, status) values (1, 27, 1);
insert into membership (groupid, memberid, status) values (17, 29, 1);
insert into membership (groupid, memberid, status) values (12, 13, 1);
insert into membership (groupid, memberid, status) values (8, 16, 2);
insert into membership (groupid, memberid, status) values (16, 31, 1);
insert into membership (groupid, memberid, status) values (8, 26, 1);
insert into membership (groupid, memberid, status) values (8, 12, 3);
insert into membership (groupid, memberid, status) values (7, 27, 3);
insert into membership (groupid, memberid, status) values (15, 8, 3);
insert into membership (groupid, memberid, status) values (11, 5, 3);
insert into membership (groupid, memberid, status) values (4, 3, 3);
insert into membership (groupid, memberid, status) values (11, 31, 3);
insert into membership (groupid, memberid, status) values (16, 6, 1);
insert into membership (groupid, memberid, status) values (13, 12, 1);
insert into membership (groupid, memberid, status) values (17, 5, 3);
insert into membership (groupid, memberid, status) values (8, 27, 2);
insert into membership (groupid, memberid, status) values (8, 13, 2);
insert into membership (groupid, memberid, status) values (18, 11, 1);
insert into membership (groupid, memberid, status) values (1, 16, 3);
insert into membership (groupid, memberid, status) values (6, 31, 1);
insert into membership (groupid, memberid, status) values (19, 1, 1);
insert into membership (groupid, memberid, status) values (11, 21, 1);
insert into membership (groupid, memberid, status) values (2, 2, 2);
insert into membership (groupid, memberid, status) values (2, 23, 1);
insert into membership (groupid, memberid, status) values (15, 24, 2);
insert into membership (groupid, memberid, status) values (10, 2, 1);
insert into membership (groupid, memberid, status) values (3, 1, 2);
insert into membership (groupid, memberid, status) values (18, 7, 2);
insert into membership (groupid, memberid, status) values (15, 16, 2);
insert into membership (groupid, memberid, status) values (15, 22, 3);
insert into membership (groupid, memberid, status) values (13, 26, 2);
insert into membership (groupid, memberid, status) values (3, 4, 3);
insert into membership (groupid, memberid, status) values (3, 8, 1);
insert into membership (groupid, memberid, status) values (1, 19, 2);
insert into membership (groupid, memberid, status) values (17, 12, 1);
insert into membership (groupid, memberid, status) values (12, 26, 3);
insert into membership (groupid, memberid, status) values (14, 17, 2);
insert into membership (groupid, memberid, status) values (10, 10, 1);
insert into membership (groupid, memberid, status) values (2, 22, 2);
insert into membership (groupid, memberid, status) values (8, 15, 2);
insert into membership (groupid, memberid, status) values (5, 3, 2);
insert into membership (groupid, memberid, status) values (6, 23, 1);
insert into membership (groupid, memberid, status) values (15, 32, 3);
insert into membership (groupid, memberid, status) values (18, 5, 2);
insert into membership (groupid, memberid, status) values (12, 33, 1);
insert into membership (groupid, memberid, status) values (3, 19, 1);
insert into membership (groupid, memberid, status) values (20, 19, 2);
insert into membership (groupid, memberid, status) values (18, 7, 2);
insert into membership (groupid, memberid, status) values (5, 22, 3);
insert into membership (groupid, memberid, status) values (13, 4, 1);
insert into membership (groupid, memberid, status) values (10, 7, 3);
insert into membership (groupid, memberid, status) values (13, 18, 3);
insert into membership (groupid, memberid, status) values (2, 31, 3);
insert into membership (groupid, memberid, status) values (13, 3, 1);
insert into membership (groupid, memberid, status) values (7, 32, 1);
insert into membership (groupid, memberid, status) values (7, 23, 2);
insert into membership (groupid, memberid, status) values (3, 14, 1);
insert into membership (groupid, memberid, status) values (20, 18, 3);
insert into membership (groupid, memberid, status) values (15, 12, 1);
insert into membership (groupid, memberid, status) values (7, 14, 3);
insert into membership (groupid, memberid, status) values (13, 20, 2);
insert into membership (groupid, memberid, status) values (4, 17, 3);
insert into membership (groupid, memberid, status) values (13, 21, 2);
insert into membership (groupid, memberid, status) values (4, 31, 3);
insert into membership (groupid, memberid, status) values (10, 22, 1);
insert into membership (groupid, memberid, status) values (14, 10, 1);
insert into membership (groupid, memberid, status) values (15, 27, 3);
insert into membership (groupid, memberid, status) values (5, 6, 1);
insert into membership (groupid, memberid, status) values (7, 27, 3);
insert into membership (groupid, memberid, status) values (11, 12, 3);
insert into membership (groupid, memberid, status) values (20, 22, 1);
insert into membership (groupid, memberid, status) values (18, 8, 1);
insert into membership (groupid, memberid, status) values (20, 25, 1);
insert into membership (groupid, memberid, status) values (16, 33, 2);
insert into membership (groupid, memberid, status) values (18, 20, 1);
insert into membership (groupid, memberid, status) values (8, 20, 3);
insert into membership (groupid, memberid, status) values (17, 11, 2);
insert into membership (groupid, memberid, status) values (9, 12, 2);
insert into membership (groupid, memberid, status) values (16, 32, 1);
insert into membership (groupid, memberid, status) values (20, 24, 1);
insert into membership (groupid, memberid, status) values (10, 23, 3);
insert into membership (groupid, memberid, status) values (20, 9, 1);
insert into membership (groupid, memberid, status) values (13, 2, 3);
insert into membership (groupid, memberid, status) values (19, 14, 3);
insert into membership (groupid, memberid, status) values (10, 12, 1);
insert into membership (groupid, memberid, status) values (5, 5, 1);
insert into membership (groupid, memberid, status) values (5, 30, 1);
insert into membership (groupid, memberid, status) values (15, 22, 3);
insert into membership (groupid, memberid, status) values (8, 16, 1);
insert into membership (groupid, memberid, status) values (19, 18, 1);

/*
  Groups details
 */
insert into groups (groupname, groupadmin) values ('OJEU', 'Lauren Leggan');
insert into groups (groupname, groupadmin) values ('Applied Kinesiology', 'Ivar Cottrell');
insert into groups (groupname, groupadmin) values ('Group Therapy', 'Gretel Johnsey');
insert into groups (groupname, groupadmin) values ('Ektron Content Management System', 'Ivar Cottrell');
insert into groups (groupname, groupadmin) values ('DMS-100', 'Lauren Leggan');
insert into groups (groupname, groupadmin) values ('EP', 'Broderick Saward');
insert into groups (groupname, groupadmin) values ('Workforce Planning', 'Carla Oxberry');
insert into groups (groupname, groupadmin) values ('Client Aquisition', 'Muffin Baiyle');
insert into groups (groupname, groupadmin) values ('Biomass', 'Delano Broomfield');
insert into groups (groupname, groupadmin) values ('Software Implementation', 'Catina Queyeiro');
insert into groups (groupname, groupadmin) values ('Facilitation', 'Hamid Caldeyroux');
insert into groups (groupname, groupadmin) values ('Capital Equipment Sales', 'Sidonia Surtees');
insert into groups (groupname, groupadmin) values ('Volleyball', 'King Swithenby');
insert into groups (groupname, groupadmin) values ('BMC Patrol', 'Lauren Leggan');
insert into groups (groupname, groupadmin) values ('Financial Risk', 'Brockie Faers');
insert into groups (groupname, groupadmin) values ('GMRA', 'Aubry Maton');
insert into groups (groupname, groupadmin) values ('DVB-C', 'Brion Caston');
insert into groups (groupname, groupadmin) values ('Air Traffic Control', 'Gran Turrell');
insert into groups (groupname, groupadmin) values ('TS2', 'Lauren Leggan');
insert into groups (groupname, groupadmin) values ('Electronics', 'King Swithenby');


/*
  User post details
 */
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Rolfe', 'Cryer', 'Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', 12, 23, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Palm', 'Mealham', 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue.', 12, 19, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Titus', 'Sinnett', 'Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti.', 19, 1, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Rowney', 'Menel', 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', 20, 23, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Proin eu mi. Nulla ac enim.', 13, 3, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Morbi non quam nec dui luctus rutrum.', 18, 9, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', 2, 0, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla.', 2, 5, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam.', 16, 4, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo.', 4, 11, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat.', 4, 14, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum.', 18, 23, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nam dui.', 15, 7, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis.', 10, 15, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue.', 6, 0, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh.', 9, 14, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Etiam pretium iaculis justo. In hac habitasse platea dictumst.', 11, 6, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', 4, 9, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti.', 2, 3, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo.', 10, 18, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec semper sapien a libero.', 11, 6, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', 5, 10, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 6, 22, 3);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.', 4, 12, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.', 4, 0, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt.', 14, 11, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', 8, 23, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna.', 12, 5, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum.', 9, 3, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue.', 19, 2, 3);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam. Nam tristique tortor eu pede.', 7, 21, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.', 19, 9, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi.', 19, 16, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio.', 20, 11, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.', 18, 5, 3);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Duis consequat dui nec nisi volutpat eleifend.', 2, 17, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.', 12, 6, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.', 18, 17, 10);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem.', 11, 19, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec dapibus.', 17, 18, 4);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', 3, 8, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet.', 10, 3, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', 19, 5, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam. Nam tristique tortor eu pede.', 7, 6, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In hac habitasse platea dictumst.', 4, 0, 10);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Sed accumsan felis. Ut at dolor quis odio consequat varius. Integer ac leo.', 19, 20, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo.', 18, 0, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis.', 5, 7, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.', 1, 4, 4);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla ut erat id mauris vulputate elementum.', 14, 3, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit.', 19, 22, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 17, 4, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', 20, 8, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', 2, 6, 10);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst.', 16, 19, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Etiam justo. Etiam pretium iaculis justo.', 5, 14, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', 16, 16, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', 8, 8, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis.', 9, 4, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla.', 7, 13, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', 11, 12, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', 16, 1, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.', 19, 18, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl.', 4, 13, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', 17, 23, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', 9, 9, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla.', 16, 1, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In quis justo. Maecenas rhoncus aliquam lacus.', 8, 23, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.', 12, 5, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', 6, 19, 10);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Aenean fermentum.', 4, 20, 0);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', 8, 11, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla tellus. In sagittis dui vel nisl.', 16, 14, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', 8, 1, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis.', 12, 4, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit.', 4, 18, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.', 15, 1, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Phasellus in felis.', 11, 21, 4);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis.', 13, 3, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Sed ante. Vivamus tortor.', 7, 21, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.', 7, 14, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Pellentesque ultrices mattis odio.', 20, 21, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus.', 13, 10, 7);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 14, 0, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt.', 3, 9, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh.', 14, 10, 5);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.', 2, 21, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', 13, 6, 3);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', 10, 16, 6);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Phasellus in felis. Donec semper sapien a libero.', 18, 5, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', 15, 15, 8);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', 16, 7, 3);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', 17, 8, 10);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum.', 8, 18, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Donec ut dolor.', 11, 22, 2);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', 15, 17, 1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl.', 18, 6, 9);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'In congue. Etiam justo. Etiam pretium iaculis justo.', 7, 2, 4);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Nullam varius. Nulla facilisi.', 6, 19, -1);
insert into posts (authorfirst, authorlast, content, likes, time, visibility) values ('Iolanthe', 'Janman', 'Etiam faucibus cursus urna.', 7, 5, 3);


/*
  User details
 */
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Rolfe', 'Cryer', 'hello', 42, 'Male', 'China', 'Shatian', 'world', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Cissiee', 'Le Maitre', 'clemaitre1@xrea.com', 54, 'Female', 'China', 'Suqin Huimin', 'xhaEB8EU', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Moishe', 'Grewe', 'mgrewe2@zimbio.com', 31, 'Male', 'Saudi Arabia', 'Tabālah', 'i3NBUP', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Babbie', 'Mapholm', 'bmapholm3@squidoo.com', 20, 'Female', 'Honduras', 'Petoa', 'hZYUPn', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Kali', 'Crilley', 'kcrilley4@redcross.org', 40, 'Female', 'Sweden', 'Kolmården', 'xII7b69RR0A', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Van', 'Webb-Bowen', 'vwebbbowen5@odnoklassniki.ru', 43, 'Female', 'China', 'Shanhou', 'fGQBbn', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Hamilton', 'Corkish', 'hcorkish6@apple.com', 45, 'Male', 'Russia', 'Burevestnik', 'XPXPf3', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Sosanna', 'Mattes', 'smattes7@wsj.com', 54, 'Female', 'China', 'Beiqi', 'VJJ35mso', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Alf', 'Beviss', 'abeviss8@surveymonkey.com', 31, 'Male', 'Indonesia', 'Kutampi', 'MrtdYWf', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Eugine', 'Tongue', 'etongue9@cnet.com', 33, 'Female', 'Russia', 'Pshada', 'I4M3S0v', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Harry', 'Kilpin', 'hkilpina@ameblo.jp', 50, 'Male', 'China', 'Dongxiang', '7irAJzxMa', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Ara', 'Riseley', 'ariseleyb@dagondesign.com', 52, 'Male', 'Somalia', 'Bandarbeyla', '8Dfk1woMU', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Dasha', 'Rockcliffe', 'drockcliffec@hugedomains.com', 16, 'Female', 'China', 'Shankeng', 'Hy5kPL93AY', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Drucie', 'Loweth', 'dlowethd@alibaba.com', 56, 'Female', 'China', 'Baihe', 'hZkV28ISw', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Kermy', 'Vowles', 'kvowlese@is.gd', 65, 'Male', 'French Polynesia', 'Afaahiti', 'v3P8ihHme', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Gabriell', 'Dugald', 'gdugaldf@wikipedia.org', 19, 'Female', 'Japan', 'Tokyo', 'me1L2CmgUu', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Kristofor', 'Denton', 'kdentong@ft.com', 50, 'Male', 'United States', 'Jackson', 'MC3yQpuPQNJ', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Nicholle', 'Brookson', 'nbrooksonh@pcworld.com', 42, 'Female', 'Czech Republic', 'Vejprnice', 'NNtjdqRHHem6', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Alia', 'Sterrick', 'asterricki@eepurl.com', 50, 'Female', 'Colombia', 'Cartagena', 'hwJGTCiU', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Ferrel', 'Greatex', 'fgreatexj@google.co.jp', 25, 'Male', 'Croatia', 'Knin', 'Sy7g0t', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Emelita', 'Anselm', 'eanselmk@drupal.org', 61, 'Female', 'Greece', 'Panórama', '4sZjs9m3', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Maxim', 'Morville', 'mmorvillel@marriott.com', 33, 'Male', 'Japan', 'Youkaichi', 'JLZcyD', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Humberto', 'Jerrome', 'hjerromem@technorati.com', 37, 'Male', 'Philippines', 'Pulo', 'PuVA4N4', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Shelley', 'Dunkirk', 'sdunkirkn@nature.com', 45, 'Male', 'Portugal', 'Giesteira', 'IiRIXGRT', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Rosalind', 'Curling', 'rcurlingo@domainmarket.com', 31, 'Female', 'Cameroon', 'Kumbo', 'TRvLiKZ', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Venus', 'Dusting', 'vdustingp@prlog.org', 58, 'Female', 'Indonesia', 'Bakung Utara', 'aW8vSKPR', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Onofredo', 'Streatfeild', 'ostreatfeildq@cbsnews.com', 65, 'Male', 'China', 'Fendou', '2cNWg3ApesfH', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Jess', 'Attarge', 'jattarger@admin.ch', 64, 'Female', 'Indonesia', 'Lhoknga', 'Ezf4NNnkdCLt', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Ulrica', 'Jouen', 'ujouens@toplist.cz', 56, 'Female', 'Argentina', 'San Pedro', 'B42L201EaRz', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Iolanthe', 'Janman', 'ijanmant@economist.com', 43, 'Female', 'France', 'Mulhouse', 'yiJqJRGDi', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Rowney', 'Menel', 'rmenelu@nasa.gov', 36, 'Male', 'Philippines', 'Lourdes', 'P5FaTWu', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Titus', 'Sinnett', 'tsinnettv@bing.com', 25, 'Male', 'Philippines', 'Camangcamang', 'cVVTQhpfeihB', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Palm', 'Mealham', 'pmealhamw@bbb.org', 26, 'Male', 'Colombia', 'Envigado', 'uQsi4Ly', 'USER');
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Ad', 'Min', 'ADMIN', 26, 'Male', 'Colombia', 'Envigado', 'PASSWORD', 'ADMIN');

/*
  User Privilages
 */
insert into role (role, roleid) values ('USER', 2);
insert into role (role, roleid) values ('ADMIN', 1);
insert into users (firstname, lastname, email, age, gender, country, city, password, role) values ('Admin', '', 'npxceptionproject@gmail.com', 0, 'Robot', 'No Where', 'Onett', 'password', 'ADMIN');