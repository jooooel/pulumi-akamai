// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use `getGtmDefaultDatacenter` data source to retrieve default datacenter id and nickname.
func GetGtmDefaultDatacenter(ctx *pulumi.Context, args *GetGtmDefaultDatacenterArgs, opts ...pulumi.InvokeOption) (*GetGtmDefaultDatacenterResult, error) {
	var rv GetGtmDefaultDatacenterResult
	err := ctx.Invoke("akamai:index/getGtmDefaultDatacenter:getGtmDefaultDatacenter", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGtmDefaultDatacenter.
type GetGtmDefaultDatacenterArgs struct {
	Datacenter *int   `pulumi:"datacenter"`
	Domain     string `pulumi:"domain"`
}

// A collection of values returned by getGtmDefaultDatacenter.
type GetGtmDefaultDatacenterResult struct {
	Datacenter *int `pulumi:"datacenter"`
	// The default datacenter ID
	DatacenterId int    `pulumi:"datacenterId"`
	Domain       string `pulumi:"domain"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The default datacenter nickname
	Nickname string `pulumi:"nickname"`
}