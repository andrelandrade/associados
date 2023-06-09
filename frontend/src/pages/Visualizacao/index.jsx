import { Associados } from "../../components/Associados";
import { NavBar } from "../../components/NavBar";

export function Visualizacao() {

    const associado = [
        { id: 'Total Som', nome: "Fabio", sobrenome: "Godoy", situacao: "Em dia" },
        { id: 'Padaria são bento', nome: "Andre", sobrenome: "Andrade", situacao: "Atrasado"},
        { id: 'Mecanica Carlão', nome: "Daniel", sobrenome: "Silva", situacao: "Em dia" },
        { id: 'Papelaria Mariana', nome: "João", sobrenome: "Pedro", situacao: "Atrasado" },
      ];


    return (
        <>
             <NavBar />
        
        <div className="p-7 text-2x1 font-semibold flex-1 h-screen">
           
            <h1>Visualização Mensal</h1>
            <div className="flex flex-col">
                <div className="overflow-x-auto sm:-mx-6 lg:-mx-8">
                    <div className="inline-block min-w-full py-2 sm:px-6 lg:px-8">
                    <div className="overflow-hidden">
                        <table className="min-w-full text-left text-sm font-light">
                        <thead className="border-b bg-neutral-800 font-medium text-white dark:border-neutral-500 dark:bg-neutral-900">
                            <tr>
                            <th scope="col" className="px-6 py-4">Empresa</th>
                            <th scope="col" className="px-6 py-4">Nome</th>
                            <th scope="col" className="px-6 py-4">Sobrenome</th>
                            <th scope="col" className="px-6 py-4">Situação</th>
                            </tr>
                        </thead>
                        <tbody> 
                            {associado.map(asso => 
                                <Associados key={asso.id} id={asso.id} nome={asso.nome} sobrenome={asso.sobrenome} situacao={asso.situacao} />
                            )}
                        </tbody>
                        </table>
                    </div>
                    </div>
                </div>
            </div>
        </div>
        </>
    )
  }