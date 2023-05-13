import { Routes, Route } from 'react-router-dom';

import { Cadastros } from '../pages/Cadastros';
import { Procurar } from '../pages/Procurar';
import { Visualizacao } from '../pages/Visualizacao';


export function AppRoutes() {
    return (
        <Routes>
            <Route path='/cadastrar' element={<Cadastros />}/>
            <Route path='/procurar' element={<Procurar />}/>
            <Route path='/visualizar' element={<Visualizacao />}/>
        </Routes>
    )
}