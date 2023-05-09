export function Procurar() {
    return (
        <div className="p-7 text-2x1 font-semibold flex-1 h-screen">
            <h1>Procurar Associados</h1>
            <br />
            <div class="mb-3">
            <div class="relative mb-4 flex w-full flex-wrap items-stretch">
                <input
                type="search"
                className="relative m-0 -mr-0.5 block w-[1px] min-w-0 flex-auto rounded-l border border-solid border-neutral-300 bg-transparent bg-clip-padding px-3 py-[0.25rem] text-base font-normal leading-[1.6] text-neutral-700 outline-none transition duration-200 ease-in-out focus:z-[3] focus:border-primary focus:text-neutral-700 focus:shadow-[inset_0_0_0_1px_rgb(59,113,202)] focus:outline-none dark:border-neutral-600 dark:text-neutral-200 dark:placeholder:text-neutral-200 dark:focus:border-primary"
                placeholder="Digite o nome do Associado"
                aria-label="Search"
                aria-describedby="button-addon1" />

                <button
                className="relative z-[2] flex items-center rounded-r bg-primary px-6 py-2.5 text-xs font-medium uppercase leading-tight text-white shadow-md transition duration-150 ease-in-out hover:bg-dark-purple hover:shadow-lg focus:bg-primary-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-primary-800 active:shadow-lg"
                type="button"
                id="button-addon1"
                data-te-ripple-init
                data-te-ripple-color="light">
                <img src="./src/assets/Search.png" alt="" />
                </button>
            </div>
            </div>
        </div>   
    )
}