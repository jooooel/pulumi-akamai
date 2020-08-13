// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package trafficmanagement

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `TrafficManagement.GtmResource` provides the resource for creating, configuring and importing a gtm resource to integrate easily with your existing GTM infrastructure to provide a secure, high performance, highly available and scalable solution for Global Traffic Management. Note: Import requires an ID of the format: `existingDomainName`:`existingResourceName`
//
// ## Example Usage
// ### Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-akamai/sdk/go/akamai/TrafficManagement"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := TrafficManagement.NewGtmResource(ctx, "demoResource", &TrafficManagement.GtmResourceArgs{
// 			AggregationType: pulumi.String("latest"),
// 			Domain:          pulumi.String("demo_domain.akadns.net"),
// 			Type:            pulumi.String("XML load object via HTTP"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type GtmResource struct {
	pulumi.CustomResourceState

	AggregationType     pulumi.StringOutput     `pulumi:"aggregationType"`
	ConstrainedProperty pulumi.StringPtrOutput  `pulumi:"constrainedProperty"`
	DecayRate           pulumi.Float64PtrOutput `pulumi:"decayRate"`
	Description         pulumi.StringPtrOutput  `pulumi:"description"`
	// — Domain name
	Domain                      pulumi.StringOutput     `pulumi:"domain"`
	HostHeader                  pulumi.StringPtrOutput  `pulumi:"hostHeader"`
	LeaderString                pulumi.StringPtrOutput  `pulumi:"leaderString"`
	LeastSquaresDecay           pulumi.Float64PtrOutput `pulumi:"leastSquaresDecay"`
	LoadImbalancePercentage     pulumi.Float64PtrOutput `pulumi:"loadImbalancePercentage"`
	MaxUMultiplicativeIncrement pulumi.Float64PtrOutput `pulumi:"maxUMultiplicativeIncrement"`
	// — Resource name
	// * `aggregationType`
	Name pulumi.StringOutput `pulumi:"name"`
	// — (multiple allowed)
	// * `datacenterId`
	// * `loadObject`
	// * `loadObjectPort`
	ResourceInstances GtmResourceResourceInstanceArrayOutput `pulumi:"resourceInstances"`
	// — Resource type
	Type       pulumi.StringOutput `pulumi:"type"`
	UpperBound pulumi.IntPtrOutput `pulumi:"upperBound"`
	// — (Boolean, Default: true) Wait for transaction to complete
	WaitOnComplete pulumi.BoolPtrOutput `pulumi:"waitOnComplete"`
}

// NewGtmResource registers a new resource with the given unique name, arguments, and options.
func NewGtmResource(ctx *pulumi.Context,
	name string, args *GtmResourceArgs, opts ...pulumi.ResourceOption) (*GtmResource, error) {
	if args == nil || args.AggregationType == nil {
		return nil, errors.New("missing required argument 'AggregationType'")
	}
	if args == nil || args.Domain == nil {
		return nil, errors.New("missing required argument 'Domain'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	if args == nil {
		args = &GtmResourceArgs{}
	}
	var resource GtmResource
	err := ctx.RegisterResource("akamai:TrafficManagement/gtmResource:GtmResource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGtmResource gets an existing GtmResource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGtmResource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GtmResourceState, opts ...pulumi.ResourceOption) (*GtmResource, error) {
	var resource GtmResource
	err := ctx.ReadResource("akamai:TrafficManagement/gtmResource:GtmResource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GtmResource resources.
type gtmResourceState struct {
	AggregationType     *string  `pulumi:"aggregationType"`
	ConstrainedProperty *string  `pulumi:"constrainedProperty"`
	DecayRate           *float64 `pulumi:"decayRate"`
	Description         *string  `pulumi:"description"`
	// — Domain name
	Domain                      *string  `pulumi:"domain"`
	HostHeader                  *string  `pulumi:"hostHeader"`
	LeaderString                *string  `pulumi:"leaderString"`
	LeastSquaresDecay           *float64 `pulumi:"leastSquaresDecay"`
	LoadImbalancePercentage     *float64 `pulumi:"loadImbalancePercentage"`
	MaxUMultiplicativeIncrement *float64 `pulumi:"maxUMultiplicativeIncrement"`
	// — Resource name
	// * `aggregationType`
	Name *string `pulumi:"name"`
	// — (multiple allowed)
	// * `datacenterId`
	// * `loadObject`
	// * `loadObjectPort`
	ResourceInstances []GtmResourceResourceInstance `pulumi:"resourceInstances"`
	// — Resource type
	Type       *string `pulumi:"type"`
	UpperBound *int    `pulumi:"upperBound"`
	// — (Boolean, Default: true) Wait for transaction to complete
	WaitOnComplete *bool `pulumi:"waitOnComplete"`
}

type GtmResourceState struct {
	AggregationType     pulumi.StringPtrInput
	ConstrainedProperty pulumi.StringPtrInput
	DecayRate           pulumi.Float64PtrInput
	Description         pulumi.StringPtrInput
	// — Domain name
	Domain                      pulumi.StringPtrInput
	HostHeader                  pulumi.StringPtrInput
	LeaderString                pulumi.StringPtrInput
	LeastSquaresDecay           pulumi.Float64PtrInput
	LoadImbalancePercentage     pulumi.Float64PtrInput
	MaxUMultiplicativeIncrement pulumi.Float64PtrInput
	// — Resource name
	// * `aggregationType`
	Name pulumi.StringPtrInput
	// — (multiple allowed)
	// * `datacenterId`
	// * `loadObject`
	// * `loadObjectPort`
	ResourceInstances GtmResourceResourceInstanceArrayInput
	// — Resource type
	Type       pulumi.StringPtrInput
	UpperBound pulumi.IntPtrInput
	// — (Boolean, Default: true) Wait for transaction to complete
	WaitOnComplete pulumi.BoolPtrInput
}

func (GtmResourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*gtmResourceState)(nil)).Elem()
}

type gtmResourceArgs struct {
	AggregationType     string   `pulumi:"aggregationType"`
	ConstrainedProperty *string  `pulumi:"constrainedProperty"`
	DecayRate           *float64 `pulumi:"decayRate"`
	Description         *string  `pulumi:"description"`
	// — Domain name
	Domain                      string   `pulumi:"domain"`
	HostHeader                  *string  `pulumi:"hostHeader"`
	LeaderString                *string  `pulumi:"leaderString"`
	LeastSquaresDecay           *float64 `pulumi:"leastSquaresDecay"`
	LoadImbalancePercentage     *float64 `pulumi:"loadImbalancePercentage"`
	MaxUMultiplicativeIncrement *float64 `pulumi:"maxUMultiplicativeIncrement"`
	// — Resource name
	// * `aggregationType`
	Name *string `pulumi:"name"`
	// — (multiple allowed)
	// * `datacenterId`
	// * `loadObject`
	// * `loadObjectPort`
	ResourceInstances []GtmResourceResourceInstance `pulumi:"resourceInstances"`
	// — Resource type
	Type       string `pulumi:"type"`
	UpperBound *int   `pulumi:"upperBound"`
	// — (Boolean, Default: true) Wait for transaction to complete
	WaitOnComplete *bool `pulumi:"waitOnComplete"`
}

// The set of arguments for constructing a GtmResource resource.
type GtmResourceArgs struct {
	AggregationType     pulumi.StringInput
	ConstrainedProperty pulumi.StringPtrInput
	DecayRate           pulumi.Float64PtrInput
	Description         pulumi.StringPtrInput
	// — Domain name
	Domain                      pulumi.StringInput
	HostHeader                  pulumi.StringPtrInput
	LeaderString                pulumi.StringPtrInput
	LeastSquaresDecay           pulumi.Float64PtrInput
	LoadImbalancePercentage     pulumi.Float64PtrInput
	MaxUMultiplicativeIncrement pulumi.Float64PtrInput
	// — Resource name
	// * `aggregationType`
	Name pulumi.StringPtrInput
	// — (multiple allowed)
	// * `datacenterId`
	// * `loadObject`
	// * `loadObjectPort`
	ResourceInstances GtmResourceResourceInstanceArrayInput
	// — Resource type
	Type       pulumi.StringInput
	UpperBound pulumi.IntPtrInput
	// — (Boolean, Default: true) Wait for transaction to complete
	WaitOnComplete pulumi.BoolPtrInput
}

func (GtmResourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gtmResourceArgs)(nil)).Elem()
}