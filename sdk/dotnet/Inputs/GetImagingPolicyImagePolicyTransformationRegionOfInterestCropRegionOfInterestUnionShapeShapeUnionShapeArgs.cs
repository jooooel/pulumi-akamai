// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("shapes", required: true)]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeShapeInputArgs>? _shapes;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeShapeInputArgs> Shapes
        {
            get => _shapes ?? (_shapes = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeShapeInputArgs>());
            set => _shapes = value;
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeInputArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeInputArgs();
    }
}