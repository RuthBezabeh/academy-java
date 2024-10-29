CREATE TABLE "FeedMetaData"
(
    "feedMetaDataId" integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    "actionUserId" integer NOT NULL,
    "feedId" integer NOT NULL,
    "isLike" boolean NOT NULL,
    "comment" character varying,
    "createdOn" timestamp without time zone NOT NULL,
    CONSTRAINT "FeedMetaData_pkey" PRIMARY KEY ("feedMetaDataId"),
    CONSTRAINT "FeedMetaData_actionUserId_fkey" FOREIGN KEY ("actionUserId")
        REFERENCES "User" ("userId"),
    CONSTRAINT "FeedMetaData_feedId_fkey" FOREIGN KEY ("feedId")
        REFERENCES "Feed" ("feedId")
)

INSERT INTO "FeedMetaData"("actionUserId", "feedId", "isLike", "comment", "createdOn")
VALUES (1, 1, true, 'Thanks!', NOW());

INSERT INTO "FeedMetaData"("actionUserId", "feedId", "isLike", "comment", "createdOn")
VALUES (1, 1, false, 'Thanks 1!', NOW()), 
       (1, 1, false, 'Thanks 2!', NOW());