// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func LookupAppSecSlowPost(ctx *pulumi.Context, args *LookupAppSecSlowPostArgs, opts ...pulumi.InvokeOption) (*LookupAppSecSlowPostResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppSecSlowPostResult
	err := ctx.Invoke("akamai:index/getAppSecSlowPost:getAppSecSlowPost", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecSlowPost.
type LookupAppSecSlowPostArgs struct {
	ConfigId         int    `pulumi:"configId"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// A collection of values returned by getAppSecSlowPost.
type LookupAppSecSlowPostResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	Json             string `pulumi:"json"`
	OutputText       string `pulumi:"outputText"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

func LookupAppSecSlowPostOutput(ctx *pulumi.Context, args LookupAppSecSlowPostOutputArgs, opts ...pulumi.InvokeOption) LookupAppSecSlowPostResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAppSecSlowPostResult, error) {
			args := v.(LookupAppSecSlowPostArgs)
			r, err := LookupAppSecSlowPost(ctx, &args, opts...)
			var s LookupAppSecSlowPostResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAppSecSlowPostResultOutput)
}

// A collection of arguments for invoking getAppSecSlowPost.
type LookupAppSecSlowPostOutputArgs struct {
	ConfigId         pulumi.IntInput    `pulumi:"configId"`
	SecurityPolicyId pulumi.StringInput `pulumi:"securityPolicyId"`
}

func (LookupAppSecSlowPostOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppSecSlowPostArgs)(nil)).Elem()
}

// A collection of values returned by getAppSecSlowPost.
type LookupAppSecSlowPostResultOutput struct{ *pulumi.OutputState }

func (LookupAppSecSlowPostResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppSecSlowPostResult)(nil)).Elem()
}

func (o LookupAppSecSlowPostResultOutput) ToLookupAppSecSlowPostResultOutput() LookupAppSecSlowPostResultOutput {
	return o
}

func (o LookupAppSecSlowPostResultOutput) ToLookupAppSecSlowPostResultOutputWithContext(ctx context.Context) LookupAppSecSlowPostResultOutput {
	return o
}

func (o LookupAppSecSlowPostResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAppSecSlowPostResult] {
	return pulumix.Output[LookupAppSecSlowPostResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupAppSecSlowPostResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAppSecSlowPostResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppSecSlowPostResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecSlowPostResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAppSecSlowPostResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecSlowPostResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupAppSecSlowPostResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecSlowPostResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o LookupAppSecSlowPostResultOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecSlowPostResult) string { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppSecSlowPostResultOutput{})
}
