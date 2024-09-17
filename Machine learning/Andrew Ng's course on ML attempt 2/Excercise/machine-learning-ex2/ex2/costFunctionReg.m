function [J, grad] = costFunctionReg(theta, X, y, lambda)
%COSTFUNCTIONREG Compute cost and gradient for logistic regression with regularization
%   J = COSTFUNCTIONREG(theta, X, y, lambda) computes the cost of using
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

end
