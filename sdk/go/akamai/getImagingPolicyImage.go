// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupImagingPolicyImage(ctx *pulumi.Context, args *LookupImagingPolicyImageArgs, opts ...pulumi.InvokeOption) (*LookupImagingPolicyImageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupImagingPolicyImageResult
	err := ctx.Invoke("akamai:index/getImagingPolicyImage:getImagingPolicyImage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImagingPolicyImage.
type LookupImagingPolicyImageArgs struct {
	Policy GetImagingPolicyImagePolicy `pulumi:"policy"`
}

// A collection of values returned by getImagingPolicyImage.
type LookupImagingPolicyImageResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id     string                      `pulumi:"id"`
	Json   string                      `pulumi:"json"`
	Policy GetImagingPolicyImagePolicy `pulumi:"policy"`
}

func LookupImagingPolicyImageOutput(ctx *pulumi.Context, args LookupImagingPolicyImageOutputArgs, opts ...pulumi.InvokeOption) LookupImagingPolicyImageResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupImagingPolicyImageResult, error) {
			args := v.(LookupImagingPolicyImageArgs)
			r, err := LookupImagingPolicyImage(ctx, &args, opts...)
			var s LookupImagingPolicyImageResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupImagingPolicyImageResultOutput)
}

// A collection of arguments for invoking getImagingPolicyImage.
type LookupImagingPolicyImageOutputArgs struct {
	Policy GetImagingPolicyImagePolicyInput `pulumi:"policy"`
}

func (LookupImagingPolicyImageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImagingPolicyImageArgs)(nil)).Elem()
}

// A collection of values returned by getImagingPolicyImage.
type LookupImagingPolicyImageResultOutput struct{ *pulumi.OutputState }

func (LookupImagingPolicyImageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImagingPolicyImageResult)(nil)).Elem()
}

func (o LookupImagingPolicyImageResultOutput) ToLookupImagingPolicyImageResultOutput() LookupImagingPolicyImageResultOutput {
	return o
}

func (o LookupImagingPolicyImageResultOutput) ToLookupImagingPolicyImageResultOutputWithContext(ctx context.Context) LookupImagingPolicyImageResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupImagingPolicyImageResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImagingPolicyImageResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupImagingPolicyImageResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImagingPolicyImageResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupImagingPolicyImageResultOutput) Policy() GetImagingPolicyImagePolicyOutput {
	return o.ApplyT(func(v LookupImagingPolicyImageResult) GetImagingPolicyImagePolicy { return v.Policy }).(GetImagingPolicyImagePolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupImagingPolicyImageResultOutput{})
}