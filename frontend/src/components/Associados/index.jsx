export function Associados({id, nome, sobrenome, situacao}) {
    return (
        <>
            <tr className="border-b dark:border-neutral-500">
                <td className="whitespace-nowrap px-6 py-4 font-medium">{id}</td>
                <td className="whitespace-nowrap px-6 py-4">{nome}</td>
                <td className="whitespace-nowrap px-6 py-4">{sobrenome}</td>
                <td className="whitespace-nowrap px-6 py-4">{situacao}</td>
            </tr>
        </>     
    )
}