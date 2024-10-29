
-- Create the "Feed" table
CREATE TABLE "Feed"
(
    "feedId" integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    "userId" integer NOT NULL,
    "content" character varying NOT NULL,
    "picture" character varying NOT NULL,
    "createdOn" timestamp without time zone NOT NULL,
    CONSTRAINT "Feed_pkey" PRIMARY KEY ("feedId"),
    CONSTRAINT "Feed_userId_fkey" FOREIGN KEY ("userId")
        REFERENCES "User" ("userId")
);

-- Insert a new row into the "Feed" table.
insert into "Feed" ("userId", "content", "picture", "createdOn") values(1, 'content1', 'picture1url', now());
-- Insert two new rows into the "Feed" table for other users.
INSERT INTO "Feed"("userId", "content", picture, "createdOn") VALUES(1,'content 1' , 'picture 1', NOW());
INSERT INTO "Feed"("userId", "content", "picture", "createdOn") 
VALUES (2, 'content 2', 'picture 2',NOW()),(4, 'content 4', 'picture 4',NOW());

-- Select all rows from the "Feed" table
select * from "Feed";
-- Update the feed content for the feed with feedId = 1
UPDATE "Feed"
SET "content"='this is my new content'
WHERE "feedId"=1;
-- Delete feed with feedId = 2
delete from "Feed" where "feedId" = 2;
-- Join the "User" and "Feed" tables.
select * from "User" join "Feed" on "User"."userId" = "Feed"."userId" ;

select * from "User" u, "Feed" f
where u."userId" = f."userId";
-- Join the "User" and "Feed" tables to display the rows for username = 'amylee'
select * from "User" u join "Feed" f on u."userId" = f."userId"
where u.username= 'amylee';