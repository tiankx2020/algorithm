select name
from score
group by name
having by min(grade)>=80
