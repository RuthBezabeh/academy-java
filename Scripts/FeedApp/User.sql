
DROP Table "User";

-- Create the "User" table

CREATE TABLE IF NOT EXISTS public."User"
(
    "userId" integer GENERATED ALWAYS AS IDENTITY NOT NULL,
    "firstName" character varying NOT NULL,
    "lastName" character varying NOT NULL,
    username character varying NOT NULL,
    phone character varying NOT NULL,
    "emailId" character varying NOT NULL,
    "password" character varying NOT NULL,
    "emailVerified" boolean NOT NULL,
    "createdOn" timestamp without time zone NOT NULL,
    CONSTRAINT "UserPkey" PRIMARY KEY ("userId"),
    CONSTRAINT "UserEmailIdKey" UNIQUE ("emailId"),
    CONSTRAINT "UserUsernameKey" UNIQUE (username)
);

-- Insert a new row into the "User" table
INSERT INTO public."User"(
	 "firstName", "lastName", username, phone, "emailId", "password", "emailVerified", "createdOn")
	VALUES ('Jessie', 'Doe', 'jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', true, current_timestamp);
-- Select all rows from the "User" table
SELECT * FROM "User";
-- Insert multiple users with a single insert statement using a VALUES list
INSERT INTO public."User" ("firstName", "lastName", username, phone, "emailId", "password", "emailVerified", "createdOn")
VALUES 	('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
		('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
		('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());

-- Select all rows from the "User" table where the value of the "emailVerified" column is true
SELECT * FROM "User" WHERE "emailVerified" = true;
-- Insert a few more users into the "User" table, (at least four more)
INSERT INTO public."User" ("firstName", "lastName", username, phone, "emailId", "password", "emailVerified", "createdOn")
VALUES 	('Peter', 'Parker', 'spiderman', '+1-555-9000', 'parker@example.com', 'password789', true, NOW()),
		('Miles', 'Morales', 'spiderman2', '+1-555-3400', 'morales@example.com', 'passwordabc', false, NOW()),
		('Natash', 'Romanoff', 'blackwidow', '+1-555-3401', 'romanoff@example.com', 'passwordabc', true, NOW()),
		('Tony', 'Stark', 'ironman', '+1-632-3400', 'stark@example.com', 'password123', false, NOW());

-- Update script
UPDATE "User" SET "username"='randyjones' WHERE "username" = 'tomjones';

-- Select script
SELECT * FROM "User" WHERE "username" = 'randyjones';

-- Delete script
DELETE FROM "User" WHERE "username" = 'randyjones';

-- Select script
SELECT * FROM "User";