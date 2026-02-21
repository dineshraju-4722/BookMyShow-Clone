import './App.css'
import { BrowserRouter as Router,Route,Routes } from 'react-router-dom'
import Navbar from './components/Navbar'
import MovieView from './components/MovieView'
import TheatesView from './components/TheatesView'

function App() {

  return (
    <Router>
      <Routes>
        <Route path='/' element={<Navbar/>} />
        <Route path='/movie' element={<MovieView/>} />
        <Route path='/theatres' element={<TheatesView/>} />
        {/* <Route path='/movies/location/movie' element={<MovieView/>} /> */}
      </Routes>
    </Router>
  )
}

export default App
