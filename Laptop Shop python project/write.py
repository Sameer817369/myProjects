"""
The function  calculate the total amount of the purchase print the purchase details in the terminal
and write it in another new text file.
"""


def purchase_invoice(name, address, number, purchased_laptop):
    file_pur = open(f"{name}.txt", "w")
    file_pur.write("Name =" + name + "\n")
    file_pur.write("Contact =" + str(number) + "\n")
    file_pur.write("Address =" + address + "\n")
    print("Name =" + name + "\n")
    print("Contact =" + str(number) + "\n")
    print("Address =" + address + "\n")
    total_amount = 0
    for i in purchased_laptop:
        total_amount += int(i[5])
        file_pur.write("\nProduct name =" + str(i[0]) + "\n")
        file_pur.write("Quantity = " + str(i[1]) + "\n")
        file_pur.write("Rate=" + str(i[2]) + "\n")
        file_pur.write("Price before tax =" + str(i[3]) + "\n")
        file_pur.write("VAT amount =" + str(i[4]) + "\n")
        file_pur.write("Total Cost =" + str(i[5]) + "\n")
        print("\nProduct name =" + str(i[0]) + "\n")
        print("Quantity = " + str(i[1]) + "\n")
        print("Rate=" + str(i[2]) + "\n")
        print("Price before tax =" + str(i[3]) + "\n")
        print("VAT amount =" + str(i[4]) + "\n")
        print("Total Cost =" + str(i[5]) + "\n")
    file_pur.write("\nTotal_amount:" + str(total_amount))
    print("\nTotal_amount:" + str(total_amount))
    file_pur.close()


"""
The function  calculate the total amount of the sale with or with out shipping cost according to user input
it also print the sales details in terminal and write it in another new text file.  
"""


def sale_invoice(name, address, number, sale_laptop, shipping):
    file_sal = open(f"{name}.txt", "w")
    file_sal.write("Name =" + name + "\n")
    file_sal.write("Contact =" + str(number) + "\n")
    file_sal.write("Address =" + address + "\n")
    print("Name =" + name + "\n")
    print("Contact =" + str(number) + "\n")
    print("Address =" + address + "\n")
    total_amount = 0
    print("\n")
    for i in sale_laptop:
        total_amount += int(i[3])
        file_sal.write("\nProduct name =" + str(i[0]) + "\n")
        file_sal.write("Quantity = " + str(i[1]) + "\n")
        file_sal.write("Rate=" + str(i[2]) + "\n")
        file_sal.write("Total Cost =" + str(i[3]) + "\n")
        print("\nProduct name =" + str(i[0]) + "\n")
        print("Quantity = " + str(i[1]) + "\n")
        print("Rate=" + str(i[2]) + "\n")
        print("Total Cost =" + str(i[3]) + "\n")

    file_sal.write("\nTotal amount:" + str(total_amount) + "\n")
    print("\nTotal amount:" + str(total_amount) + "\n")

    if shipping == 'y' or shipping == 'Y':
        file_sal.write("shipping cost:$25\n")
        file_sal.write("Total cost with shipping:" + str(total_amount + 25))
        print("shipping cost:$25\n")
        print("Total cost with shipping:" + str(total_amount + 25))
    elif shipping == 'n' or shipping == 'N':
        print("Thank you")

    file_sal.close()
