import { useState } from "react";

export function App() {

  const [open, setOpen] = useState(true);

  return (
    <div className="flex">
      <div className={`${open ? "w-72" : "w-20"} duration-300 h-screen bg-dark-purple relative`}>
        <img src="./src/assets/control.png" 
        className="absolute cursor-pointer rounded-full
        -right-3 top-9 w-7 border-2 border-dark-purple" 
        onClick={() => setOpen(!open)}
        /> 
      </div>
      <div className="p-7 text-2x1 font-semibold flex-1 h-screen">
        <h1>Home Page</h1>
      </div>
    </div>
  )
}
