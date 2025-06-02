from tkinter import *
import tkinter.ttk as ttk

class UI(Tk):
    def __init__(self):
        super().__init__()
        self.title("More advanced tkinter")
        self.build()

    def build(self):
        self.build_data_model()
        self.build_widgets()

    def build_data_model(self):
        self.counter = IntVar(self, 0)
        self.counter.trace_add("write", self.create_message)
        self.message = StringVar(self,value="No click!")

    def build_widgets(self):
        self.display_label = ttk.Label(self, textvariable=self.message)
        self.display_label.grid(row=0, column=0, columnspan=2)
        
        self.add_button = ttk.Button(self, text="+", command=self.add)
        self.add_button.grid(row=1, column=0)
        
        self.sub_button = ttk.Button(self, text="-", command=self.sub)
        self.sub_button.grid(row=1, column=1)

    def create_message(self, *args):
        clicks = self.counter.get()
        if clicks == 0:
            self.message.set("No click!")
        elif clicks == 1:
            self.message.set("1 click!")
        else:
            self.message.set(f"{clicks} clicks!")

    def add(self):
        self.counter.set(self.counter.get() + 1)

    def sub(self):
        self.counter.set(self.counter.get() - 1)


if __name__ == "__main__":
    ui = UI()
    ui.mainloop()