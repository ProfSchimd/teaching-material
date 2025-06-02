from tkinter import *
import tkinter.ttk as ttk

class UI():

    def __init__(self):
        self.root = Tk()
        self.root.title("My first Tkinter")
        self.root.geometry("300x300")
        self.root.minsize(100,100)
        self.root.maxsize(600,600)
        self.counter = IntVar()
        ttk.Label(self.root, textvariable=self.counter).pack()
        ttk.Button(self.root, text="+", command=self.add).pack()
        ttk.Button(self.root, text="-", command=self.sub).pack()

    def add(self):
        self.counter.set(self.counter.get() + 1)
    
    def sub(self):
        self.counter.set(self.counter.get() - 1)

    

def main():
    ui = UI()
    ui.root.mainloop()


if __name__ == "__main__":
    main()