export function Associados({id, nome, sobrenome, situacao}) {
    return (
        <>
            <tr className="border-b dark:border-neutral-500">
                <td className="whitespace-nowrap px-6 py-4 font-medium">{id}</td>
                <td className="whitespace-nowrap px-6 py-4">{nome}</td>
                <td className="whitespace-nowrap px-6 py-4">{sobrenome}</td>
                <td className={situacao == "Em dia" ? "whitespace-nowrap px-6 py-4 text-green-600 font-medium" : "whitespace-nowrap px-6 py-4 text-red-800 font-medium"}>{situacao}</td>
            </tr>
        </>     
    )
}