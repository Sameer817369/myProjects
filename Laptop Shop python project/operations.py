from read import items_info
from write import purchase_invoice, sale_invoice

"""
The function allows the customer to enter the ID of the laptop they wish to purchase as well as the quantity desired. 
It then checks the input and produces a list of the laptop ID. The code also retrieves information about the laptops 
from the items_info() function and shows the name, company, price, and quantity of the selected laptop. 
If the user provides an incorrect ID or amount, the function prompts them to enter the proper values again.
"""
def laptop_id():
    user_input_id = None
    user_asked_quantity = None

    loop_sale = True
    while loop_sale:
        while True:
            try:
                user_input_id = int(input("Which laptop do you want to purchase enter the laptop ID"))
                break
            except ValueError:
                print("Invalid: Enter ID only")
        loop_sale = False
        print("\n")
        info = items_info()
        while user_input_id <= 0 or user_input_id > len(info):
            print("ID not matched")
            print("\n")
            user_input_id = int(input("Which laptop do you want to purchase enter the laptop ID"))

        info = items_info()
        user_selected_laptop = info[user_input_id][5]
        user_selected_laptop1 = info[user_input_id][0]
        user_selected_laptop2 = info[user_input_id][1]
        user_selected_laptop3 = info[user_input_id][2]
        print(
            "-----------------------------------------------------------------------------------------------------")
        print("Name:", user_selected_laptop1, ",", "Company:", user_selected_laptop2, ",", "Price:",
              user_selected_laptop3, ",", "Quantity:", user_selected_laptop)
        print(
            "-----------------------------------------------------------------------------------------------------")
        print("\n")
        user_asked_quantity = int(input("Enter the quantity you want"))
        while user_asked_quantity < 0 or user_asked_quantity > int(user_selected_laptop):
            print("\n")
            print("not enough quantity")
            user_asked_quantity = int(input("Enter the quantity you want"))

    return [user_input_id, user_asked_quantity, loop_sale]


'''
This code defines a function sale() that takes user information like name, address, and contact number.
It then calls the laptop_id() function to obtain the laptop specifications that the user wishes to purchase. 
It adds the sale data to the sale_laptop list and updates the laptop quantity in the Laptop_Details.txt file.
The user is then asked if they want to buy another laptop, and if not, whether they want to ship the products. 
Finally, it calls the sale_invoice() function to generate an invoice for the sale. 
'''
sale_laptop = []


def sale():
    print("\n")
    name = input("Enter your name")
    address = input("Enter your address")
    while True:
        try:
            number = input("Enter your Contact Number")
            break
        except ValueError:
            print("Enter your number")

    print("\n")
    print("-----------------------------------------------------------------------------------------------------")
    temp = True
    while temp:
        detail = laptop_id()
        user_input_id = detail[0]
        user_asked_quantity = detail[1]

        info = items_info()
        info[user_input_id][5] = int(info[user_input_id][5]) - int(user_asked_quantity)
        file = open("Laptop_Details.txt", "w")
        for i in info.values():
            file.write(i[0] + "," + i[1] + "," + str(i[2]) + "," + str(i[3]) + "," + str(i[4]) + "," + str(i[5]))
            file.write("\n")
        file.close()

        product_name = info[user_input_id][0]
        user_selected_quantity = user_asked_quantity
        laptop_price = info[user_input_id][2]
        selected_laptop_price = info[user_input_id][2].replace("$", '')
        cost_price = int(selected_laptop_price) * int(user_selected_quantity)

        sale_laptop.append([product_name, user_selected_quantity, laptop_price, cost_price])
        loop_again = True
        while loop_again:
            sale_again = input("Do you want to sale another laptop press(Y/N)")
            if sale_again == 'y' or sale_again == "Y":
                print("Sale of another laptop")
                temp = True
                break
            elif sale_again == 'n' or sale_again == 'N':
                temp = False
                loop_again = False

            else:
                print("Invalid: Your option", sale_again,
                      "does not match as per our requirement. Please look at the option and try again")

            loop_obj = True
            while loop_obj:
                shipping = input("Do you want to ship your products(Y/N)")
                if shipping == 'Y' or shipping == 'y':
                    print("Thank you for shipping")
                    sale_invoice(name, address, number, sale_laptop, shipping)
                    break
                elif shipping == 'N' or shipping == 'n':
                    print("Thank you for sale")
                    sale_invoice(name, address, number, sale_laptop, shipping)
                    break
                else:
                    print("Invalid: Your option", shipping,
                          "does not match as per our requirement. Please look at the option and try again")
                print("\n")
                print(
                    "-------------------------------------------------------------------------------------------------")



'''
This code defines a function purchase() that takes user information like name, address, and contact number.
It then calls the laptop_id() function to obtain the laptop specifications that the user wishes to purchase. 
It adds the purchase data to the purchase_laptop list and updates the laptop quantity in the Laptop_Details.txt file.
The user is then asked if they want to buy another laptop, Finally, it calls the sale_invoice() function to generate 
an invoice for the sal with VAT added. 
'''
purchased_laptop = []


def purchase():
    print("\n")
    name = input("Enter your name")
    address = input("Enter your address")
    while True:
        try:
            number = input("Enter your Contact Number")
            break
        except ValueError:
            print("Enter your number")

    print("\n")
    print("-----------------------------------------------------------------------------------------------------")
    temp = True
    while temp:
        detail = laptop_id()
        user_input_id = detail[0]
        user_asked_quantity = detail[1]

        info = items_info()
        info[user_input_id][5] = int(info[user_input_id][5]) + int(user_asked_quantity)
        file = open("Laptop_Details.txt", "w")
        for i in info.values():
            file.write(i[0] + "," + i[1] + "," + str(i[2]) + "," + str(i[3]) + "," + str(i[4]) + "," + str(i[5]))
            file.write("\n")
            # print(i)
        file.close()
        product_name = info[user_input_id][0]
        user_selected_quantity = user_asked_quantity
        laptop_price = info[user_input_id][2]
        selected_laptop_price = info[user_input_id][2].replace("$", '')
        cost_price = int(selected_laptop_price) * int(user_selected_quantity)

        vat_rate = 13
        vat_amount = cost_price * (vat_rate / 100)
        total_cost = cost_price + vat_amount
        purchased_laptop.append(
            [product_name, user_selected_quantity, laptop_price, cost_price, vat_amount, total_cost])
        while True:
            purchase_again = input("Do you want to purchase another laptop press(Y/N)")
            if purchase_again == 'y' or purchase_again == "Y":
                print("Purchase of another laptop")
                temp = True
                break
            elif purchase_again == 'n' or purchase_again == 'N':
                print("Thank you for purchase")
                temp = False
                purchase_invoice(name, address, number, purchased_laptop)
                break
            else:
                print("Invalid: Your option", purchase_again,
                      "does not match as per our requirement. Please look at the option and try again")

