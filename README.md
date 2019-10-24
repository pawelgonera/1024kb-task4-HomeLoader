# 1024kb-task4-HomeLoader
Fourth task from [1024kb](https://1024kb.pl) blog.

### Purpose
The task was to create loader to loading data of home's informations from .home file in specific pattern.

### Description

#### Data components:
* **Home** - name, address, house holders, rooms
* **Room** - name, color, height, area, elements
* **Element** - name, position(x, y, z), weight, size(length, width, height)

#### The pattern of .home file:
```
homeName%address%houseHolders%rooms
roomName1%color(#hex)%height%area%elements
elementName1FromRoom1%positionX%positionY%positionZ%weight%length%width%height
elementName2FromRoom1%...
...
roomName2%...
elementName1FromRoom2%...
...
```

#### Example
```
House on a green hill%Green street 33/24%3%2
Mother's room%#00ff00%10.5%25%3
Desk%10%3.5%0.0%2%1.5%0.7%30.3
Lamp%10%35%0.7%0.1%0.1%0.1%0.5
Pen%12%38%0.7%0.01%0.15%0.03%0.1
Father's room%#ffffff%10.5%23%1
Armchair%8.3%5.4%1.3%1.5%1.5%2%23
```
