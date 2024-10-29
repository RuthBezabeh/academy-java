select * from "User" u
join "Profile" p on u."userId"=p."userId"; 

select u."userId", concat(u."firstName",' ', u."lastName") as name, u.username, p.headline, p. 
from "User" u
join "Profile" p 
on u."userId"=p."userId"; 

