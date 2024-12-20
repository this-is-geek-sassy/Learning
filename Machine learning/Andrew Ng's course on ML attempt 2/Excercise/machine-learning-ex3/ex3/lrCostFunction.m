function [J, grad] = lrCostFunction(theta, X, y, lambda)
%LRCOSTFUNCTION Compute cost and gradient for logistic regression with 
%regularization
%   J = LRCOSTFUNCTION(theta, X, y, lambda) computes the cost of using
%   theta as the parameter for regularized logistic regression and the
%   gradient of the cost w.r.t. to the parameters. 

% Initialize some useful values
m = length(y); % number of training examples

% You need to return the following variables correctly 
J = 0;
grad = zeros(size(theta));

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta.
%               You should set J to the cost.
%               Compute the partial derivatives and set grad to the partial
%               derivatives of the cost w.r.t. each parameter in theta
%
% Hint: The computation of the cost function and gradients can be
%       efficiently vectorized. For example, consider the computation
%
%           sigmoid(X * theta)
%
%       Each row of the resulting matrix will contain the value of the
%       prediction for that example. You can make use of this to vectorize
%       the cost function and gradient computations. 
%
% Hint: When computing the gradient of the regularized cost function, 
%       there're many possible vectorized solutions, but one solution
%       looks like:
%           grad = (unregularized gradient for logistic regression)
%           temp = theta; 
%           temp(1) = 0;   % because we don't add anything for j = 0  
%           grad = grad + YOUR_CODE_HERE (using the temp variable)
%

d = size(grad,1);

h = X*theta;
h = sigmoid(h);

part1 = log(h);
part1 = -(y.*part1);

part2 = log(1.-h);
part2 = (1.-y).*part2;

temp = part1-part2;
temp = sum(temp);
J = temp./m;

regu = sum(theta(2:d).^2);
regu = regu.*(lambda/(2*m));

J = J+regu;


grad(1) = (1/m)*sum((h-y).*X(:,1));
clear part1;
part1 = (sum((h-y).*X(:,2:d)))';
part1 = part1./m;

clear part2;
part2 = (lambda/m).*theta(2:d);


grad(2:d) = part1+part2;



% =============================================================

grad = grad(:);

end
