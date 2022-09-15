// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use `getIamRoles` to list roles for the current account and contract type. The account and contract type are determined by the access tokens in your API client. Use the `roleId` from this data source to construct the `authGrantsJson` when creating or updating a user's auth grants.
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-akamai/sdk/v3/go/akamai"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		my_roles, err := akamai.GetIamRoles(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("roles", my_roles)
// 		return nil
// 	})
// }
// ```
// ## Attributes reference
//
// These attributes are returned:
//
// * `roles` — A list of roles.
//
// [API Reference](https://developer.akamai.com/api/core_features/identity_management_user_admin/v2.html#getroles)
func GetIamRoles(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetIamRolesResult, error) {
	var rv GetIamRolesResult
	err := ctx.Invoke("akamai:index/getIamRoles:getIamRoles", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getIamRoles.
type GetIamRolesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id    string            `pulumi:"id"`
	Roles []GetIamRolesRole `pulumi:"roles"`
}