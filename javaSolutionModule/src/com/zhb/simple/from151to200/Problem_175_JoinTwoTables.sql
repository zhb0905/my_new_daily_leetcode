-- 175. 组合两个表

-- 表: Person
-- | PersonId    | int     |
-- | FirstName   | varchar |
-- | LastName    | varchar |

-- 表: Address
-- +-------------+---------+
-- | AddressId   | int     |
-- | PersonId    | int     |
-- | City        | varchar |
-- | State       | varchar |
-- +-------------+---------+

-- 编写一个SQL查询来报告 Person 表中每个人的姓、名、城市和状态。如果 personId 的地址不在 Address 表中，则报告为空  null 。
--
-- 以 任意顺序 返回结果表。

-- 输出
-- +-----------+----------+---------------+----------+
-- | firstName | lastName | city          | state    |
-- +-----------+----------+---------------+----------+

-- 问题描述：左连接

select firstName, lastName, city, `state`
from Person  left join Address
ON Person.PersonId = Address.PersonId
;