import { createAppContainer } from 'react-navigation';
import { createStackNavigator } from 'react-navigation-stack';
import Tambahdata from '../component/screen/Tambahdata'
import Tampildata from '../component/screen/Tampildata'
import Editdata from '../component/screen/Editdata'


const stack = createStackNavigator({

	Tampildata: {
    	screen: Tampildata
	},

	Tambahdata: {
    	screen: Tambahdata
	},

	Editdata: {
    	screen: Editdata
	}
	
})



const HomeStack = createAppContainer(stack);
export default HomeStack;