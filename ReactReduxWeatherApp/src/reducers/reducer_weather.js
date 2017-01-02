import { FETCH_WEATHER } from '../actions/index';

export default function(state = [], action) {
	switch (action.type) {
		case FETCH_WEATHER:
			return [ action.payload.data, ...state ];
	}
	return state;
}

// Strive to avoid mutating state. Never use `state.weather...` Instead, return a new object that will take the place of existing state. Flatten an existing array to create a new one using ellipses. `...`