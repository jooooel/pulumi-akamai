// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageArgs : global::Pulumi.InvokeArgs
    {
        [Input("color")]
        public string? Color { get; set; }

        [Input("colorVar")]
        public string? ColorVar { get; set; }

        [Input("height")]
        public string? Height { get; set; }

        [Input("heightVar")]
        public string? HeightVar { get; set; }

        [Input("transformation")]
        public Inputs.GetImagingPolicyImagePolicyTransformationArgs? Transformation { get; set; }

        [Input("width")]
        public string? Width { get; set; }

        [Input("widthVar")]
        public string? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageArgs Empty => new GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageArgs();
    }
}