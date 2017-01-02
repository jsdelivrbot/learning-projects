import React, { Component, PropTypes } from 'react';
import { connect } from 'react-redux';
import { fetchPost } from '../actions/index';
import { deletePost } from '../actions/index';
import { Link } from 'react-router';

class PostsShow extends Component {
	static contextTypes = {
		router: PropTypes.object
	};
	
	componentWillMount() {
		this.props.fetchPost(this.props.params.id);
	}

	onDeleteClick(props) {
		this.props.deletePost(this.props.params.id)
		.then(() => {
			this.context.router.push('/');
		});
	}	
	
	render() {
		const { post } = this.props;
		if (!post) {
			return <div>Loading...</div>;
		}

		return (
			<div>
				<Link to="/" className="btn btn-primary">Back to Posts</Link>
				<button 
					className="btn btn-danger pull-md-right" 
					onClick={this.onDeleteClick.bind(this)}>
					Delete Post</button>
				<h3>{post.title}</h3>
				<h6>Categories: {post.categories}</h6>
				<div>{post.content}</div>
			</div>
		);
	}
}

function mapStateToProps(state) {
	return { post: state.posts.post };
}

export default connect(mapStateToProps, { fetchPost, deletePost })(PostsShow);