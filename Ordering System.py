from datetime import date
from datetime import datetime
item = "Item"
oz = '16oz'
oz1 = '22oz'
g = '150g'
g1 = '300g'
quantity = "Quantity"
sizes = "size"
totals = 'total'
the_list = "Select Number"
hot_coffee = ["Americano", "Latte", "Black", "Cappucino", "Espresso"]
c16oz = ['150','150','150','150', '150',]
c22oz = ['200', '200', '200', '200', '200']
coffee16oz = 150
coffee22oz = 200

shake = ['Banana Milkshake', 'Vanilla Milkshake', 'Chocolate Milkshake', 'Strawberry Milkshake',]
s16oz = ['100', '100', '100', '100']
s22oz = ['120', '120', '120', '120']
shake16oz = 100
shake22oz = 120

meal = ['Beef/Pork', 'Loaded avocado toast', 'Italian pasta salad']
m150g = ['150', '150', '150', '150','150']
m300g = ['250', '250', '250', '250','250']
meal150g = 150
meal300g = 250

pastry = ['Flaky Pastry', 'Shortcrust Pastry', 'Puff Pastry', 'Choux Pastry','Filo Pastry']
p150g = ['100', '100', '100', '100','100']
p300g = ['120', '120', '120', '120','120']
pastry150g = 100
pastry300g = 120
list_order = ['1', '2', '3','4', '5']
order_list = []
size_list = []
sub_total = []
quantity_total = []
print("Welcome to Dami Coffee Shop!")
print()
print("Available Product:")
print("Hot Coffee:", *hot_coffee, sep ='\n' )
print()
print("Shake:", *shake,  sep = '\n')
print()
print("Meal:", *meal,  sep = '\n')
print()
print("Pastry:", *pastry ,  sep = '\n')
print()

print()
order = True
while order == True:
    print('------------------------------ Menu ------------------------------')
    print()
    print('Select 1 --- Hot Coffee')
    print('Select 2 --- Shake')
    print('Select 3 --- Meal')
    print('Select 4 --- Pastry')
    select = int(input("Select a Number:"))
    if select == 1:
        print(f"{item:>10s}{oz:>25s}{oz1:>15s}{the_list:>18s}\n")
        for i in range(0, len(hot_coffee)):
	        print(f"{hot_coffee[i] : <20}{c16oz[i] : ^15}{c22oz[i] : ^15}{list_order[i] : >5}")
        
        coffee_select = int(input("Enter a number of your order: "))
        
        if coffee_select == 1:
            print("You have Selected: Amerikano")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 16 oz or select number 2 -- 22 oz: "))
                if size == 1:
                    size = 150
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Amerikano')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Amerikano')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif coffee_select == 2:
            print("You have Selected: Latte")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 150
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Latte')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Latte')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif coffee_select == 3:
            print("You have Selected: Black")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 150
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Black')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Black')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif coffee_select == 4:
            print("You have Selected: Cappucino")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 150
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Cappucino')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Cappucino')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif coffee_select == 5:
            print("You have Selected: Espresso")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 150
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Espresso')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Espresso')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
        else:
            print("Welcome back to Main Menu")
            order = True
                    
    elif select == 2:
        print(f"{item:>10s}{oz:>25s}{oz1:>15s}{the_list:>18s}\n")
        for i in range(0, len(shake)):
	        print(f"{shake[i] : <20}{s16oz[i] : ^15}{s22oz[i] : ^15}{list_order[i] : >5}")
        shake_select = int(input("Enter a number of your order: "))
        if shake_select == 1:
            print("You have Selected: Banana Milkshake")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 16 oz or select number 2 -- 22 oz: "))
                if size == 1:
                    size = 100
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Banana Milkshake')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 120
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Banana Milkshake')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif shake_select == 2:
            print("You have Selected: Vanilla Milkshake")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 100
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Vanilla Milkshake')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 120
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Vanilla Milkshake')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
        elif shake_select == 3:
            print("You have Selected: Chocolate Milkshake")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 150
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Chocolate Milkshake')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Chocolate Milkshake')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
        elif shake_select == 4:
            print("You have Selected: Strawberry Milkshake")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 16 oz or Select Number 2 -- 22 oz? "))
                if size == 1:
                    size = 150
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Strawberry Milkshake')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 200
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Strawberry Milkshake')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    print("Welcome back to the Main Menu")
                    order = True
        else:
            print("Welcome back to Main Menu")
            order = True
    elif select == 3:
        print(f"{item:>10s}{oz:>25s}{oz1:>15s}{the_list:>18s}\n")
        for i in range(0, len(meal)):
	        print(f"{meal[i] : <20}{m150g[i] : ^15}{m300g[i] : ^15}{list_order[i] : >5}")
        meal_select = int(input("Enter a number of your order: "))
        if meal_select == 1:
            print("You have Selected: Beef/Pork")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 150g or Select Number 2 -- 300g? "))
                if size == 1:
                    size = 150
                    mealtotal = quantity * size
                    sub_total.append(mealtotal)
                    order_list.append('Beef/Pork')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 250
                    shaketotal = quantity * size
                    sub_total.append(shaketotal)
                    order_list.append('Beef/Pork')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif meal_select == 2:
            print("You have Selected: Loaded avocado toast")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 150g or Select Number 2 -- 300g? "))
                if size == 1:
                    size = 100
                    mealtotal = quantity * size
                    sub_total.append(mealtotal)
                    order_list.append('Loaded avocado toast')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 120
                    mealtotal = quantity * size
                    sub_total.append(mealtotal)
                    order_list.append('Loaded avocado toast')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
        elif meal_select == 3:
            print("You have Selected: Italian pasta salad")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select Number 1 -- 150g or Select Number 2 -- 300g? "))
                if size == 1:
                    size = 150
                    mealtotal = quantity * size
                    sub_total.append(mealtotal)
                    order_list.append('Italian pasta salad')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 200
                    mealtotal = quantity * size
                    sub_total.append(mealtotal)
                    order_list.append('Italian pasta salad')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
        else:
            print("Welcome back to Main Menu")
            order = True
    elif select == 4:
        print(f"{item:>10s}{oz:>25s}{oz1:>15s}{the_list:>18s}\n")
        for i in range(0, len(pastry)):
	        print(f"{pastry[i] : <20}{p150g[i] : ^15}{p300g[i] : ^15}{list_order[i] : >5}")
        
        pastry_select = int(input("Enter a number of your order: "))
        
        if pastry_select == 1:
            print("You have Selected: Flaky Pastry")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 150g or select Number 2 -- 300g: "))
                if size == 1:
                    size = 100
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Flaky Pastry')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 120
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Flaky Pastry')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif pastry_select == 2:
            print("You have Selected: Shortcrust Pastry")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 150g or select Number 2 -- 300g: "))
                if size == 1:
                    size = 100
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Shortcrust Pastry')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 120
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Shortcrust Pastry')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif pastry_select == 3:
            print("You have Selected: Puff Pastry")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 150g or select Number 2 -- 300g: "))
                if size == 1:
                    size = 100
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Puff Pastry')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 120
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Puff Pastry')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif pastry_select == 4:
            print("You have Selected: Choux Pastry")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 150g or select Number 2 -- 300g: "))
                if size == 1:
                    size = 150
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Choux Pastry')
                    size_list.append('150g')
                    size_order = False
                elif size == 2:
                    size = 200
                    coffeetotal = quantity * size
                    sub_total.append(coffeetotal)
                    order_list.append('Choux Pastry')
                    size_list.append('300g')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
                    
        elif pastry_select == 5:
            print("You have Selected: Filo Pastry")
            quantity= int(input("Quantity: "))
            quantity_total.append(quantity)
            size_order = True
            while size_order == True:
                size = int(input("Select number 1 -- 150g or select Number 2 -- 300g: "))
                if size == 1:
                    size = 100
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Filo Pastry')
                    size_list.append('16oz')
                    size_order = False
                elif size == 2:
                    size = 120
                    pastrytotal = quantity * size
                    sub_total.append(pastrytotal)
                    order_list.append('Filo Pastry')
                    size_list.append('22oz')
                    size_order = False
                else:
                    print("Invalid number")
                    size_order = True
            next_order = True
            while next_order == True:
                next_order = input("Do you want another order y/n? ")
                if next_order.lower() == 'y':
                    order = True
                elif next_order.lower() == 'n':
                    order = False
                else:
                    print("Invalid keyword")
                    next_order = True
moneycheck = True
while moneycheck == True:    
    print(f"{item}{quantity:>20}{sizes:>13}{totals:>15}")
    for i in range(0, len(order_list)):
	    print(f"{order_list[i] : <20}{quantity_total[i] : ^8}{size_list[i] : ^15}{sub_total[i] : >8}")
    print()
    print("***************************************************************") 
    print("The total amount is: ", sum(sub_total))
    money = float(input("Cash:"))
    if money < sum(sub_total):
        print("Insufficient Amount")
        moneycheck = True
    elif money >= sum(sub_total):
        print("Change: ", money - sum(sub_total))
        print()
        break
    
today = date.today()
now = datetime.now()
current_time = now.strftime("%H:%M:%S")
print("Date:",today)    
print("Time:",current_time)


print("               Thank you and Come back again!         ")
