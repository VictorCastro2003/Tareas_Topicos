'''
Created on 17 mar 2023

@author: victor
'''
import tkinter as tk
from tkinter import *
import math
primer_numero_global=-1
operador=-1
#Ventana principal
ventana_inicio = tk.Tk()
ventana_inicio.title("Calculadora con PYTHON")
ventana_inicio.geometry("265x420")

#Centrar la ventana=====================================
wtotal = ventana_inicio.winfo_screenwidth()
htotal = ventana_inicio.winfo_screenheight()
wventana = 265
hventana = 420
pwidth = round(wtotal/2-wventana/2)
pheight = round(htotal/2-hventana/2)
ventana_inicio.geometry(str(wventana)+"x"+str(hventana)+"+"+str(pwidth)+"+"+str(pheight))
#Funciones para variables
numeros= StringVar() 

def mostrar_numero(num):
    if(numeros.get().__contains__(".")and num!="."):
        numeros.set(numeros.get()+num)
    elif(numeros.get().__contains__(".")and num=="."or numeros.get()=="" and num=="."):
        pass
    else:
        numeros.set(numeros.get()+num)
    
def realizar_operacion(op):
    global primer_numero_global
    primer_numero_global=numeros.get()
    limpiar_caja()
    global operador
    operador = op
    #print(operador)
    
    
def obtener_resultado():
    global operador
    if(operador=="*"):
        res= float(primer_numero_global)* float(numeros.get())
        numero_redondeo= round(res)

        if res - numero_redondeo == 0:
            numero_formato = '{:.0f}'.format(numero_redondeo)
        else:
            numero_formato = '{:.2f}'.format(res)

        numeros.set(numero_formato)
        
    elif(operador=="+"):
        res= float(primer_numero_global)+float(numeros.get())
        numero_redondeo = round(res)

        if res - numero_redondeo == 0:
            numero_formato = '{:.0f}'.format(numero_redondeo)
        else:
            numero_formato = '{:.2f}'.format(res)

        numeros.set(numero_formato)
    elif(operador=="-"):
        res= float(primer_numero_global)-float(numeros.get())
        numero_redondeo = round(res)

        if res - numero_redondeo == 0:
            numero_formato = '{:.0f}'.format(numero_redondeo)
        else:
            numero_formato = '{:.2f}'.format(res)

        numeros.set(numero_formato)
    elif(operador=="/"):
        res= float(primer_numero_global)/float(numeros.get())
        numero_redondeo = round(res)

        if res - numero_redondeo == 0:
            numero_formato = '{:.0f}'.format(numero_redondeo)
        else:
            numero_formato = '{:.2f}'.format(res)

        numeros.set(numero_formato)

def limpiar_caja():
    numeros.set("")
    
def clear():
    numeros.set(numeros.get()[:-1])
    
def porcentaje():
    if(numeros.get()!=""):
        res=float(numeros.get())/100
        numeros.set(res)
    else:
        pass
def mas_menos():
    valor = numeros.get()
    if valor and valor[0] == "-":
        numeros.set(valor[1:])
    else:
        numeros.set("-" + valor)
        
def raizCuadrada():
    val = float(numeros.get())
    raiz = math.sqrt(val)
    numero_redondeo = round(raiz)

    if raiz - numero_redondeo == 0:
        numero_formato = '{:.0f}'.format(numero_redondeo)
    else:
        numero_formato = '{:.2f}'.format(raiz)

    numeros.set(numero_formato)


def cuadrado():
    valorN = float(numeros.get())
    res = valorN ** 2
   
    numero_redondeo = round(res)

    if res - numero_redondeo == 0:
        numero_formato = '{:.0f}'.format(numero_redondeo)
    else:
        numero_formato = '{:.2f}'.format(res)
    
    numeros.set(str(numero_formato))
    

def reciproco():
    valorN = float(numeros.get())
    res = 1/valorN 
   
    numero_redondeo = round(res)

    if res - numero_redondeo == 0:
        numero_formato = '{:.0f}'.format(numero_redondeo)
    else:
        numero_formato = '{:.2f}'.format(res)
    
    numeros.set(str(numero_formato)) 
   
txt_titulo  = tk.Label(ventana_inicio, text="Calculadora Basica").place(x=5, y=5, width=150, height=20)
caja_mantisa = tk.Entry(ventana_inicio,width=20,justify=RIGHT,textvariable=numeros)
caja_mantisa.place(x=20, y=30, width=230, height=30)


btn_raizC=tk.Button(ventana_inicio,text="sqrt",command=lambda:raizCuadrada())
btn_raizC.place(x=20, y=65, width=50, height=50)

btn_cuadrado=tk.Button(ventana_inicio,text="x^2",command=lambda:cuadrado())
btn_cuadrado.place(x=80, y=65, width=50, height=50)

btn_reciproco=tk.Button(ventana_inicio,text="1/x",command=lambda:reciproco())
btn_reciproco.place(x=140, y=65, width=50, height=50)

btn_por=tk.Button(ventana_inicio, text="%",command=lambda:porcentaje())
btn_por.place(x=200, y=65, width=50, height=50)



btn_c=tk.Button(ventana_inicio, text="C", command=lambda:limpiar_caja())
btn_c.place(x=20, y=125, width=110, height=50)

btn_delete=tk.Button(ventana_inicio, text="<<<", command=lambda:clear())
btn_delete.place(x=140, y=125, width=50, height=50)

btn_div=tk.Button(ventana_inicio, text="/",command=lambda:realizar_operacion("/"))
btn_div.place(x=200, y=125, width=50, height=50)

btn_num_7=tk.Button(ventana_inicio, text="7", command=lambda:mostrar_numero("7")).place(x=20, y=185, width=50, height=50)
btn_num_8=tk.Button(ventana_inicio, text="8", command=lambda:mostrar_numero("8")).place(x=80, y=185, width=50, height=50)
btn_num_9=tk.Button(ventana_inicio, text="9", command=lambda:mostrar_numero("9")).place(x=140, y=185, width=50, height=50)
btn_mult=tk.Button(ventana_inicio, text="X",command=lambda:realizar_operacion("*"))
btn_mult.place(x=200, y=185, width=50, height=50)

btn_num_4=tk.Button(ventana_inicio, text="4", command=lambda:mostrar_numero("4")).place(x=20, y=240, width=50, height=50)
btn_num_5=tk.Button(ventana_inicio, text="5", command=lambda:mostrar_numero("5")).place(x=80, y=240, width=50, height=50)
btn_num_6=tk.Button(ventana_inicio, text="6", command=lambda:mostrar_numero("6")).place(x=140, y=240, width=50, height=50)

btn_menos=tk.Button(ventana_inicio, text="-",command=lambda:realizar_operacion("-"))
btn_menos.place(x=200, y=240, width=50, height=50)

btn_num_1=tk.Button(ventana_inicio, text="1", command=lambda:mostrar_numero("1")).place(x=20, y=300, width=50, height=50)
btn_num_2=tk.Button(ventana_inicio, text="2", command=lambda:mostrar_numero("2")).place(x=80, y=300, width=50, height=50)
btn_num_3=tk.Button(ventana_inicio, text="3", command=lambda:mostrar_numero("3")).place(x=140, y=300, width=50, height=50)

btn_mas=tk.Button(ventana_inicio, text="+",command=lambda:realizar_operacion("+"))
btn_mas.place(x=200, y=300, width=50, height=50)

btn_num_0=tk.Button(ventana_inicio, text="0", command=lambda:mostrar_numero("0")).place(x=80, y=360, width=50, height=50)
btn_punto=tk.Button(ventana_inicio, text=".", command=lambda:mostrar_numero(".")).place(x=140, y=360, width=50, height=50)
btn_mas_menos=tk.Button(ventana_inicio, text="+-", command=lambda:mas_menos()).place(x=20, y=360, width=50, height=50)

btn_igual=tk.Button(ventana_inicio, text="=",command=lambda:obtener_resultado())
btn_igual.place(x=200, y=360, width=50, height=50)

ventana_inicio.resizable(width=False, height=False)

ventana_inicio.mainloop()