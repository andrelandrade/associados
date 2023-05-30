import { Link } from "react-router-dom"

export function NavBar() {

return (
        <header className="header sticky top-0 bg-white shadow-md flex items-center justify-between px-8 py-02">
        <h1 className="w-3/12">
            <a href="">
            <img className="h-10 w-10" src="./src/assets/logo_1.png" alt="" />
            </a>
        
        </h1>

        <nav className="nav font-semibold text-lg">
            <ul className="flex items-center">
                <li className="p-4 border-b-2 border-primary border-opacity-0 hover:border-opacity-100 hover:text-primary duration-200 cursor-pointer active">
                <Link to="/visualizar">Visualização</Link>
                </li>
                <li className="p-4 border-b-2 border-primary border-opacity-0 hover:border-opacity-100 hover:text-primary duration-200 cursor-pointer">
                <Link to="/cadastrar">Cadastrar</Link>
                </li>
                <li className="p-4 border-b-2 border-primary border-opacity-0 hover:border-opacity-100 hover:text-primary duration-200 cursor-pointer">
                <Link to="/procurar" href="">Procurar</Link>
                </li>
                <li className="p-4 border-b-2 border-primary border-opacity-0 hover:border-opacity-100 hover:text-primary duration-200 cursor-pointer">
                <a href="">Editar</a>
                </li>
            </ul>
        </nav>

        <div className="w-3/12 flex justify-end">
            
        </div>
    </header>
    )
    
}