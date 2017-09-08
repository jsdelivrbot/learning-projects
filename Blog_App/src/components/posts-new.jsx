import _ from 'lodash';
import React, {Component} from 'react';
import {Field, reduxForm} from 'redux-form';
import {connect} from 'react-redux';
import {createPost} from '../actions';

const FIELDS = {
	title: { 
		type: 'input',
		label: 'Title for Post'
	},
	categories: { 
		type: 'input',
		label: 'Enter some categories for this post'
	},
	content: { 
		type: 'textarea',
		label: 'Post Contents'
	}
};

class PostsNew extends Component {
	renderField(field) {
		const { meta: {touched, error} } = field;
		const className = `form-group ${touched && error ? 'has-danger' : '' }`;
		return (
			<div className={className}>
				<label>{field.label}</label>
				<input
					className="form-control"
					type="text"
					{...field.input}
				/>
				<div className="text-help">
					<p>
						{touched ? error : ''}
					</p>
				</div>
			</div>
		);
	}

	onSubmit(values) {
		this.props.createPost(values, () => {
			this.props.history.push('/');
		});
	}

	render() {
		const {handleSubmit} = this.props;

		return (
			<form onSubmit={handleSubmit(this.onSubmit.bind(this))}>
				<Field
					name="title"
					label="Title"
					component={this.renderField}
				/>
				<Field
					name="categories"
					label="Categories"
					component={this.renderField}
				/>
				<Field
					name="content"
					label="Post Content"
					component={this.renderField}
				/>
				<button 
					type="submit" 
					className="btn btn-primary"
				>
					Submit
				</button>
			</form>
		);
	}
}

function validate(values) {
	const errors = {};

	_.each(FIELDS, (type, field) => {
		if (!values[field]) {
			errors[field] = `Enter ${field}`;
		}
	});

	return errors;
}

export default reduxForm({
	validate,
	form: 'PostsNewForm',
	fields: _.keys(FIELDS)
})(connect(null, {createPost})(PostsNew));