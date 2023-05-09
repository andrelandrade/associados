import { useState } from "react";

export function NavBar() {

    const [open, setOpen] = useState(true);
    const Menus = [
        { title: "Visualização", src: "Chart_fill" },
        { title: "Cadastros", src: "User", gap: true },
        { title: "Procurar", src: "Search" },
        { title: "Editar", src: "Setting", gap: true },
      ];

    return(
        <div className={`${open ? "w-72" : "w-20"} duration-300 h-screen p-5 pt-8 bg-dark-purple relative`}>
            <img src="./src/assets/control.png" 
            className={`absolute cursor-pointer rounded-full
            -right-3 top-9 w-7 border-2 border-dark-purple ${!open && "rotate-180"}`}
            onClick={() => setOpen(!open)}
            /> 

            <div className="flex gap-x-4 items-center">
                <img src="./src/assets/logo.png"  
                className={`cursor-pointer duration-500 ${open && "rotate-[360deg]"}`}/>

                <h1 className={`text-white origin-left font-medium text-x1 duration-300 ${!open && "scale-0"}`}>Associados</h1>
            </div>
            <ul className="pt-6">
                {Menus.map((menu, index) => (
                    <li key={index} className={`text-gray-300 text-sm flex items-center gap-x-4 cursor-pointer p-2 hover:bg-light-purple rounded-md ${menu.gap ? "mt-9" : "mt-2"}`}>
                       <img src={`./src/assets/${menu.src}.png`} alt="" />
                       <span className={`${!open && 'hidden'} origin-left duration-200`}>{menu.title}</span>
                    </li>
                ))}
            </ul>
        </div>
    )
}