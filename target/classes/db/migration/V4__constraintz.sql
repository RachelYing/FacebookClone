/*
  Schema
  Engine: PostGreSQL
  Version: 0.0.4
  Description: Constraints
  Author: Atharva
 */

 /*
  Structure
  */
ALTER TABLE users ADD CONSTRAINT uniqueemail UNIQUE (email);

ALTER TABLE membership
  ADD CONSTRAINT memberid_fk
  FOREIGN KEY (memberid)
  REFERENCES users (userid)
  ON DELETE CASCADE;

ALTER TABLE friends
  ADD CONSTRAINT userone_fk
  FOREIGN KEY (useroneid)
  REFERENCES users (userid)
  ON DELETE CASCADE;

ALTER TABLE friends
  ADD CONSTRAINT usertwo_fk
  FOREIGN KEY (usertwoid)
  REFERENCES users (userid)
  ON DELETE CASCADE;

ALTER TABLE posts
ADD wall INT NOT NULL
DEFAULT -1;

UPDATE posts
SET wall = (SELECT userid FROM users
WHERE (posts.authorfirst = users.firstname AND posts.authorlast = users.lastname));

ALTER TABLE posts
ADD CONSTRAINT wall_fk
  FOREIGN KEY (wall)
  REFERENCES users (userid)
  ON DELETE CASCADE;

